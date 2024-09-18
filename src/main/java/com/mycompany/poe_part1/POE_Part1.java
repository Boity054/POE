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
       //Declarations
       String username;
       String password;
       String firstname;
       String lastname;
       
        //create an object of the scanner
        Scanner input=new Scanner(System.in);
        
        //prompt the user for both username and password
        System.out.println("Enter username:");
         username=input.nextLine();
        
        System.out.println("Enter password:");
        password=input.next();
        
         System.out.println("Enter First Name:");
        firstname=input.next();
        
         System.out.println("Enter Last Name:");
        lastname=input.next();
        
        //Pass the external class
        Login log= new Login();
        
         //method to check the password and username
        log.checkUsername(username);
        log.checkPasswordComplexity(password);
    }
}
