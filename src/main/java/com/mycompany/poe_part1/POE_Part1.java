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
        
       // log.setUsername("Boi_ty");
       // log.setPassword("*Bvi012let");
       //Declarations
        String firstname;
       String lastname;
       String username;
       String password;
       
        //create an object of the scanner
        Scanner input=new Scanner(System.in);
        
        //prompt the user for username,password, Firstname and lastname
          System.out.println("Enter First Name:");
        firstname=input.next();
        
         System.out.println("Enter Last Name:");
        lastname=input.next();
       
        do{
        System.out.println("Enter username:");
        username=input.next();
        }while (log.checkUsername(username));
        
       do{
        System.out.println("Enter password:");
        password=input.next();
       }while(log.checkPasswordComplexity(password));
               
        //register the user
        String registrationMessage=log.registerUser(username,password);
        System.out.println(registrationMessage);
        
        // login user
        boolean LoginSuccess= log.loginUser(username,password);
        System.out.println(LoginSuccess);
        
        //dispaly  login Status
        String loginMessage=log.returnLoginStatus(LoginSuccess);
        System.out.println(loginMessage);
    }
}
