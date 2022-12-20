/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seanuy
 */
public class User {
    
    private int userId;
    private String email;
    private String password;
    private String firstName;
    private String surname;
    private List<Integer> moviesWatchedId = new ArrayList<>();


    public User(String email, String password, String firstName, String surname) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
    }

    public User(int userId, String email, String password, String firstName, String surname, List<Integer> moviesWatchedId) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.moviesWatchedId = moviesWatchedId;
    }

    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Integer> getMoviesWatchedId() {
        return moviesWatchedId;
    }

    public void setMoviesWatchedId(List<Integer> moviesWatchedId) {
        this.moviesWatchedId = moviesWatchedId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", moviesWatchedId=" + moviesWatchedId +
                '}';
    }
}


