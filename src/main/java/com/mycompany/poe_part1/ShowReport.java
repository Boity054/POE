/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
public class ShowReport {
     private Task[] tasks;
    // Storing tasks in parallel arrays
    private int numTasks = 100;
    private  String[] taskname = new String[numTasks];
    private  int[] taskNumber = new int[numTasks];
    private String[] developer= new String[numTasks];
    private String[] taskID= new String[numTasks];
    private  int[] taskDuration = new int[numTasks];
    private String[] taskStatus= new String[numTasks];
    private int count = 0;
    
    /* public void addTask(Task task) {
        // populating the arrays 
        taskname[count] = taskname;
        developer[count] = ask.developerDetails;	
        taskID[count] = task.taskID();
        taskDuration[count] = task.taskDuration();
        taskStatus[count] = task.taskStatus();
        count++;
    }*/
    
    //Dsplay all of the tasks
    
    
   //display the for all tasks with the status of done
    public String displayStatusDone(String[] developer,String[] taskname,int[] taskDuration){
        StringBuilder report=new StringBuilder("Tasks with status 'Done':\n");
        for (int i=0;i<count;i++){
            if (taskStatus[i].equalsIgnoreCase("Done")){
                report.append("Developer: ").append(developer[i])
                       .append("Task Name: ").append(taskname[i])
                       .append("Task Duration: ").append(taskDuration[i]).append("\n");
            }
        }
        return report.toString();
    }
    
    
}
