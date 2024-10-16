/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE_Part1 {

   public static void main(String[] args) { 
       //Pass the external class
        Login log= new Login();
        
       //Declarations
        String firstname;
       String lastname;
       String username ;
       String password;
       
        //create an object of the scanner
        Scanner input=new Scanner(System.in);
        
        //prompt the user to enter the firstname. lastname, username and password
          System.out.println("Enter First Name:");
        firstname=input.next();
        log.setFirstname(firstname);
        
         System.out.println("Enter Last Name:");
        lastname=input.next();
        log.setLastname(lastname);
       
        System.out.println("Enter username:");
        username=input.next();
        log.setUsername(username);
        
        System.out.println("Enter password:");
        password=input.next();
        log.setPassword(password);
        
               
        //register the user
        String registration=log.registerUser(firstname,lastname,username,password);
        System.out.println("Registration: "+ registration);
        
        //login user
      
        System.out.println("Enter username to login:");
        username=input.next();
        System.out.println("Enter password to login:");
        password=input.next();
        
        //dispaly  login Status
        boolean loginSuccessful= log.loginUser(firstname, lastname,username,password);
       String loginMessage=log.returnLoginStatus(loginSuccessful);
       System.out.println(loginMessage);
    }
}
