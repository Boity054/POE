/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
     //private declarations
    private String taskname;
    private int taskNumber;
    private String description;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    
    public Task(){
    this. taskname=taskname;
    this.taskNumber=taskNumber;
    this.description=description;
    this.developerDetails=developerDetails;
    this.taskDuration=taskDuration;
    this.taskID=taskID;
    this.taskStatus="To do"+ "Doing"+ "Done";
    }   
//check task Description
    public boolean checkTaskDescription(String description){
        return description.length()<50;
    }
    
    //Creating the task ID
    public String createTaskID(String taskID){
        String firstTwoLetters=taskname.substring(0,2).toUpperCase();
        String lastThreeLetters=developerDetails.substring(developerDetails.length()-3).toUpperCase();
        return firstTwoLetters+":" + taskNumber + ":"+ lastThreeLetters;
    }
    
    //display task details
     public String printTaskDetails(){
         return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber + "\nTask Name: " + taskname + "\nTask Description: " + description + "\nTask ID: " + taskID + "\nDuration: " + taskDuration + " hours";
     }
}
