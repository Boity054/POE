/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.ArrayList; 

/**
 *
 * @author RC_Student_lab
 */
public class POE_Part1 {

   public static void main(String[] args) { 
       //Pass the Login external class
        Login log= new Login();
        
       //Declarations
        String firstname;
       String lastname;
       String username ;
       String password;
       
        //create an object of the scanner
        Scanner input=new Scanner(System.in);
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        
        //prompt the user to enter the firstname. lastname, username and password
          System.out.println("Enter First Name:");
        firstname=input.next();
         System.out.println("Enter Last Name:");
        lastname=input.next();
        System.out.println("Create username:");
        username=input.next();
        System.out.println("Create password:");
        password=input.next();
         
        //register the user
        String registration=log.registerUser(firstname,lastname,username,password);
        System.out.println("Registration: "+ registration);
        
        //login user
        System.out.println("Enter username to login:");
        username=input.next();
        System.out.println("Enter password to login:");
        password=input.next();
        
        //dispaly  login Status
        boolean loginSuccessful= log.loginUser(username,password);
       String loginMessage=log.returnLoginStatus(loginSuccessful);
       System.out.println(loginMessage);
       
       if(loginSuccessful){
           JOptionPane.showMessageDialog(dialog, "Welcome to  EasyKanBan.");
       } 
       
       //pass the Task external class
      Task ask=new Task();
      
     //display the options the user can choose from
    while(loginSuccessful){
    int option = Integer.parseInt(JOptionPane.showInputDialog(null,"===Menu===\n(1)Add Tasks\n(2)Show Reports\n(3)Quit\nEnter the number of the option: "));
       switch(option){
           case 1:
               //Display add tasks
               ask.addTasks();
               break;
           case 2:
               //Displays the report
              ask.showReport();
               break;
           case 3:
               //exits the system
               System.exit(0);
               break;
           default:
              JOptionPane.showMessageDialog(null,"Invalid option");
              break;
       }  
       }
       input.close();
       dialog.dispose();
    }
}
