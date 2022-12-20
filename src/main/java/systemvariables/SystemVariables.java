/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package systemvariables;

/**
 *
 * @author seanuy
 */
public enum SystemVariables {
    
       DBCONNECTION("jdbc:mysql://127.0.0.1:3306/movieRenting?useSSL=false"),
    USER("root"),
    PASSWORD("");

    public final String value;

    SystemVariables(String value) {
        this.value = value;
    }
}
