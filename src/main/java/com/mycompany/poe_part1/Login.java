/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
     //method to check the username 
    public static boolean checkUsername(String username){
         //check if the user name meets the conditions
         if (username.equals("Boi_ty")){
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
        if(password.equals("#Bvi0let12")){
            System.out.println("Password successfully captured.");
        }
        else{
              System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 character,a capital letter, a number and a speacial charater.");
        }   
        return password.length()<=8 && password.matches("[A-Z]") && password.matches("[0-9]") && password.contains("~!@#$%^&*()_-?/<>:}{][");
    }
      //method to register the user
    public static String registerUser(String username, String password){
       
        if(!checkUsername(username)){
            return "The username is incorrectly formatted.";
        }
        else if(!checkPasswordComplexity(password)){
            return "The password does not meet the complexity requirements.";
        }
        else{
            return "The two above conditions have been met and the user has been registered successfully.";
        }
    }
}
