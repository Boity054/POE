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
     //private declarations;
     private Task[] tasks;
     private static int numTasks=100;
     private static String[]taskname = new String[numTasks] ;
     private static int[] taskNumber= new int[numTasks] ;
     private static String[] description= new String[numTasks] ;
     static String[] developerDetails= new String[numTasks] ;
     private static int[] taskDuration= new int[numTasks] ;
     private static String[] taskID= new String[numTasks] ;
     private static String[] taskStatus= new String[numTasks] ;
     
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
      
     // Add tasks method
public void addTasks(){
    // Use an ArrayList to store tasks (this part is unnecessary, as you're already storing tasks in arrays)
    // ArrayList<Task> taskList = new ArrayList<>();
    
    // Declarations (Initialize arrays once)
    String[] selection = new String[]{"To Do","Doing","Done"};
    
    // Prompt user for the number of tasks
    String input = JOptionPane.showInputDialog(null, "How many tasks do you wish to enter?");
    
    try {
        numTasks = Integer.parseInt(input);
        
        // Initialize arrays before entering the loop (this avoids overwriting them)
        taskname = new String[numTasks];
        taskNumber = new int[numTasks];
        description = new String[numTasks];
        developerDetails = new String[numTasks];
        taskDuration = new int[numTasks];
        taskID = new String[numTasks];
        taskStatus = new String[numTasks];

        // Loop to enter the tasks
        for (int i = 0; i < numTasks; i++) {
            // Prompt the user to enter task details
            taskname[i] = JOptionPane.showInputDialog("Enter Task Name: " + (i + 1));
            taskNumber[i] = i;

            // Task description (with validation for length)
            do {
                description[i] = JOptionPane.showInputDialog("Enter Task Description:");
                if (!checkTaskDescription(description[i])) {
                    JOptionPane.showMessageDialog(null, "Task Description is too long, try again.");
                }
            } while (description[i].length() > 50);
            
            developerDetails[i] = JOptionPane.showInputDialog("Enter Developer Details:");
            taskDuration[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));

            // Generate task ID
            taskID[i] = createTaskID(taskname[i], developerDetails[i], i);
            JOptionPane.showMessageDialog(null, "Task ID: " + taskID[i]);

            // Set task status
            taskStatus[i] = (String) JOptionPane.showInputDialog(null, "Select Task Status:", "Task Status:",
                    JOptionPane.QUESTION_MESSAGE, null, selection, selection[2]);

            // Print task details
            JOptionPane.showMessageDialog(null, "Tasks successfully captured:\n" + printTaskDetails(i));
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please try again");
    }
}

       
     // Method to display all of the tasks
public String displayAllTasks() {
    StringBuilder report = new StringBuilder("All tasks are captured:\n");
    for (int i = 0; i < numTasks; i++) {
        report.append("\nTask #").append(i+1).append("\n")
              .append("\nTask Name: ").append(taskname[i])
              .append("\nDeveloper: ").append(developerDetails[i])
              .append("\nTask ID: ").append(taskID[i])
              .append("\nTask Duration: ").append(taskDuration[i])
              .append("\nTask Status: ").append(taskStatus[i]).append("\n");
    }
    return report.toString();
}

    
   //method to display the for all tasks with the status of done
   // Method to display the tasks with status 'Done'
public String displayStatusDone() {
    StringBuilder report = new StringBuilder("Tasks with status 'Done':\n");
    for (int i = 0; i < taskStatus.length; i++) {
        if (taskStatus[i].equalsIgnoreCase("Done")) {
            report.append("Developer: ").append(developerDetails[i])
                  .append("\nTask Name: ").append(taskname[i])
                  .append("\nTask Duration: ").append(taskDuration[i]).append("\n");
        }
    }
    return report.toString();
}

    
    //method to diaply the longest duration
    public String longestDuration(String[] developerDetails,String[] taskname,int[] taskDuration){
        if (taskDuration.length == 0) {
            return "No tasks accessible.";
        }

        int maxDurationIndex = 0;
        for (int i = 1; i < taskDuration.length; i++) {
            if (taskDuration[i] > taskDuration[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        return "Task with longest duration: \nDeveloper: "+ developerDetails[maxDurationIndex] +"\n Task Duration: " + taskDuration[maxDurationIndex];
    }
    
    //method to search task by name 
   
public String searchTaskname(String[] taskname, String searchname) {
    for (int i = 0; i < taskname.length; i++) {
        if (taskname[i].equalsIgnoreCase(searchname)) {
            return "Task found:\nTaskname: " + taskname[i] + "\nDeveloper: " + developerDetails[i] + "\nTask Status: " + taskStatus[i];
        }
    }
    return "Task not available.";
}


    
   public String searchTaskByDeveloper(String[] developerDetails, String searchDeveloper) {
    StringBuilder report = new StringBuilder("Tasks assigned to " + searchDeveloper + ":\n");
    boolean taskFound = false;

    for (int i = 0; i < developerDetails.length; i++) {
        if (developerDetails[i].equalsIgnoreCase(searchDeveloper)) {
            report.append("Task Name: ").append(taskname[i]).append("\nTask Status: ").append(taskStatus[i]).append("\n");
            taskFound = true;
        }
    }

    if (!taskFound) {
        return "No tasks found for developer: " + searchDeveloper;
    }
    return report.toString();
}


    
    //method to delete a task
   public String deleteTask(String[] taskname, String deleteTaskname) {
    for (int i = 0; i < taskname.length; i++) {
        if (taskname[i].equalsIgnoreCase(deleteTaskname)) {
            // Shift all elements after the deleted task
            for (int j = i; j < taskname.length - 1; j++) {
                taskname[j] = taskname[j + 1];
                developerDetails[j] = developerDetails[j + 1];
                taskID[j] = taskID[j + 1];
                taskDuration[j] = taskDuration[j + 1];
                taskStatus[j] = taskStatus[j + 1];
            }

            // Nullify the last element (since it's shifted)
            taskname[taskname.length - 1] = null;
            developerDetails[developerDetails.length - 1] = null;
            taskID[taskID.length - 1] = null;
            taskDuration[taskDuration.length - 1] = 0;
            taskStatus[taskStatus.length - 1] = null;

            return "Task successfully deleted";
        }
    }
    return "Task not found or not deleted";
}


    
      //method for the show report 
       public void showReport() {
           boolean quit = false;
        while (!quit) {
           int option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                     Choose a report option:
                                                                     1.Display All the task
                                                                     2.Display task with Done status
                                                                     3.Display longest duration of tasks
                                                                     4.Search task by name
                                                                     5.Search task by developer name
                                                                     6.Delete tasks
                                                                     7.back""")); 
        switch (option) {
               case 1:
            // displays all the tasks captured
            JOptionPane.showMessageDialog(null,displayAllTasks());
            break;
            
                case 2:
            // displays all the Done tasks
            JOptionPane.showMessageDialog(null, displayStatusDone());
            break;
            
                case 3:
            //display the longest duration of tasks
            JOptionPane.showMessageDialog(null,longestDuration(developerDetails,taskname,taskDuration));
            break;
            
             case 4:
                  // Search task by task name
               String searchname = JOptionPane.showInputDialog("Enter task name to search:");
               String searchResult = searchTaskname(taskname, searchname);
                 JOptionPane.showMessageDialog(null, searchResult);
              break;
            
             case 5:
                 // Search task by developer name
                   String searchDev = JOptionPane.showInputDialog("Enter developer name to search:");
                 String developerResult = searchTaskByDeveloper(developerDetails, searchDev);
                   JOptionPane.showMessageDialog(null, developerResult);
                 break;


           case 6:
             // Enable user to delete the captured tasks
             String deleteName = JOptionPane.showInputDialog("Enter task name to delete:");
              String deleteResult = deleteTask(taskname, deleteName);
             JOptionPane.showMessageDialog(null, deleteResult);
             break;

                case 7:
                    quit=true;
           break;
            default:
              JOptionPane.showMessageDialog(null,"Invalid option");
              break;
                 }
            }
}
}
