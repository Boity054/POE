/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

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
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        
        //prompt the user to enter the firstname. lastname, username and password
          System.out.println("Enter First Name:");
        firstname=input.next();
        
        
         System.out.println("Enter Last Name:");
        lastname=input.next();
        
       
        System.out.println("Enter username:");
        username=input.next();
        
        
        System.out.println("Enter password:");
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
       else{
           JOptionPane.showMessageDialog(dialog, "Try again!");
       }
        // calling the Task external class
        Task ask=new Task();
        int[] tasks={};
         String[] taskStatus={"To Do","Doing","Done"};
         
          //display the options the user can choose from
     while(loginSuccessful){
    int option = Integer.parseInt(JOptionPane.showInputDialog(null,"===Menu===\n(1)Add Tasks\n(2)Show Reports\n(3)Quit\nEnter the number of the option: "));
   
     while(option !=0){
       switch(option){
           case 1:
               //promts the user to enter number tasks
               int numTasks= Integer.parseInt(JOptionPane.showInputDialog(null,"How many tasks do you wish to enter?"));
               for (int i = 0; i < numTasks; i++) {
            //promt user input
            String taskname = JOptionPane.showInputDialog("Enter Task Name: " + (i + 1) );
            String description = JOptionPane.showInputDialog("Enter Task Description:");
            String developerDetails = JOptionPane.showInputDialog("Enter Developer Details:");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
            int seclection= JOptionPane.showOptionDialog(null,"Enter Task Status:","Task Status",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,taskStatus,taskStatus[0]);
               
                //Check if the descrioption meets the requriements
            if(!ask.checkTaskDescription(description)){
                JOptionPane.showMessageDialog(null, "Task Description is too long, try again.");
            }else{
                continue;
            }
             // using a method that adds all the hours of each tasks duration
        JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + ask.returnTotalHours());
               }
          // Printing the details of the captured tasks
            JOptionPane.showMessageDialog(null,"Tasks successfully captured:" + ask.printTaskDetails());
               break;
           case 2:
               //Displays the report
               JOptionPane.showMessageDialog(null,"Coming soon!");
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
      }
       
       input.close();
       dialog.dispose();
    }
}
