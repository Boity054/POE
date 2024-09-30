/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;
import java.util.Scanner;
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
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    
    //method to verify the login details
    public static boolean loginUser(String username, String password){
        do{
        if(username.equals(username) && password.equals(password)){
           return true;
        }
        else{
            return false;
        } 
        }while(false);
    }
    
    public String returnLoginStatus(boolean successfulLogin){
        if (successfulLogin){
            return "Welcome "+ getFirstname() +" "+ getLastname()+",it is great to see you again.";
        }
        else{
            return "Username or password incorrect, try again.";
        }
    }

     //method to check the username 
    public static boolean checkUsername(String username){
         //check if the user name meets the conditions
         
         if (username.equals(username.contains("_") && username.length()<=5)){
             System.out.println("Username successfully captured.");
         }
         else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore is no more than 5 characters in length.");
         }
         return username.contains("_") && username.length()<=5;
    }
    
    //method to check for password
    public static boolean checkPasswordComplexity(String password){
        //check if the password is complex
        if(password.equals(password.length()<=8 && password.matches("[A-Z]") && password.matches("[0-9]") && password.contains("~!@#$%^&*()_-?/<>:}{]["))){
            System.out.println("Password successfully captured.");
        }
        else{
              System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 character,a capital letter, a number and a speacial charater.");
        }   
        return password.length()<=8 && password.matches("[A-Z]") && password.matches("[0-9]") && password.contains("~!@#$%^&*()_-?/<>:}{][");
    }
      //method to register the user
    public static String registerUser(String username, String password){
        if(!checkUsername(username) && !checkPasswordComplexity(password)){
            return "The username is incorrectly formatted or The password does not meet the complexity requirements.";
        }
        else{
            return "The two above conditions have been met and the user has been registered successfully.";
        }
    }
}   
