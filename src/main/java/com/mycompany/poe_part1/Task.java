/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
public */
 class Task {
     //private declarations
     private static String[] taskname;
     private static int[] taskNumber;
     private static String[] description;
     private static String[] developerDetails;
     private static int[] taskDuration;
     private static String[] taskID;
     private static String[] taskStatus;
 
//check task Description
    public boolean checkTaskDescription(String description){
        return description.length()<50;
    }
    
    //Creating the task ID
    public String createTaskID(String taskname ,String developerDetails, int taskNumber){
        String firstTwoLetters=taskname.substring(0,2).toUpperCase();
        String lastThreeLetters=developerDetails.substring(developerDetails.length()-3).toUpperCase();
        return firstTwoLetters+":" + taskNumber + ":"+ lastThreeLetters;
    }
    
    //display task details
     public String printTaskDetails(int details){
         return "Task Status: " +taskStatus[details] + "\nDeveloper Details: " + developerDetails[details] + "\nTask Number: " + taskNumber[details] + "\nTask Name: " + taskname[details] + "\nTask Description: " + description[details] + "\nTask ID: " + taskID[details] + "\nDuration: " +taskDuration[details] ;
     }
      
     //return estimated hours
      public int returnTotalHours( int taskDuration) {
        return taskDuration;
      }
      
      public void addTasks(){
           // Use an ArrayList to store tasks
        ArrayList<Task> taskList = new ArrayList<>();
         String[] selection=new String[]{"To Do","Doing","Done"};
         int numTasks=0;
          String input= JOptionPane.showInputDialog(null,"How many tasks do you wish to enter?");
         try{
             numTasks = Integer.parseInt(input);
         
         
         
         
          
               
               for (int i = 0; i < numTasks; i++) {
            //promt user input
            taskname = new String[numTasks];
            taskname[i] = JOptionPane.showInputDialog("Enter Task Name: " + (i + 1) );
            
            taskNumber= new int[numTasks];
            taskNumber[i]=i;
            
            description=new String[numTasks];
           do{
               description[i] = JOptionPane.showInputDialog("Enter Task Description:");
           
           
                //Check if the descrioption meets the requriements
            if(!checkTaskDescription(description[i])){
                JOptionPane.showMessageDialog(null, "Task Description is too long, try again.");
            }else{
                continue;
            }
           }while(description[i].length()>50);
           
           developerDetails = new String[numTasks];
           developerDetails[i] = JOptionPane.showInputDialog("Enter Developer Details:");
           
           taskDuration = new int [numTasks];
           taskDuration[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
           
           taskID= new String[numTasks];
           taskID[i]=createTaskID(taskname[i] ,developerDetails[i],i);
           JOptionPane.showMessageDialog(null,"Task ID:" + taskID[i]);
           
           taskStatus= new String[numTasks];
           taskStatus[i]= (String)JOptionPane.showInputDialog(null,"Task Status:","Choose a Status:",JOptionPane.QUESTION_MESSAGE,null,selection,selection[2]);
             
             // using a method that adds all the hours of each tasks duration
       // JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + returnTotalHours());
               
          // Printing the details of the captured tasks
            JOptionPane.showMessageDialog(null,"Tasks successfully captured:/n" + printTaskDetails(i));
               }
               
               
               
               
               
      }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null,"Please try again");
          return;
                  
      }
      }
}
