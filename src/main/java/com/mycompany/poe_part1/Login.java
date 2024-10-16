/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    
    //Getters and Setters
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
     //method to check the username 
    public boolean checkUsername(String username){
         //check if the user name meets the conditions
         return username.contains("_") && username.length()<=5;
    }
    
    //method to check for password
    public boolean checkPasswordComplexity(String password){
        //check if the password is complex  
       return password.length()<= 8 && password.matches(".*[A-Z].*") &&password.matches(".*[a-z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*().]*");

    }
      //method to register the user
    public String registerUser(String firstname, String lastname, String username, String password){
        if(!checkUsername(username)){
            return "The username is incorrectly formatted.";
        }
        if(!checkPasswordComplexity(password)){
            return "The password does not meet the complexity requirements.";
        }
            return "The two above conditions have been met and the user has been registered successfully.";
    }
     
    //method to verify the login details
    public boolean loginUser(String firstname, String lastname, String username, String password){
        return username.equals(this.username) && password.equals(this.password);
       
    }
    
    public String returnLoginStatus(boolean successfulLogin){
        if (successfulLogin){
            return "Welcome "+ getFirstname() +" "+ getLastname()+",it is great to see you again.";
        }
        else{
            return "Username or password incorrect, try again.";
        }
    }
}   
