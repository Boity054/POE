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
      public String displayAllTasks() {
        StringBuilder report = new StringBuilder("All taskes are caputured:\n");
        for (int i = 0; i < count; i++) {
            report.append("\nTask Name: ").append(taskname[i])
                    .append("\nDeveloper: ").append(developer[i])
                    .append("\nTask ID: ").append(taskID[i])
                    .append("\nTask Duration: ").append(taskDuration[i])
                    .append("\nTask Status: ").append(taskStatus[i]).append("\n");
        }
        return report.toString();
    }
    
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
    
    //diaply the longest duration
    public String longestDuration(String[] developer,String[] taskname,int[] taskDuration){
        if (count == 0) {
            return "No tasks accessible.";
        }

        int maxDurationIndex = 0;
        for (int i = 1; i < count; i++) {
            if (taskDuration[i] > taskDuration[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        return "Task with longest duration: \nDeveloper: "+ developer[maxDurationIndex] +"\n Task Duration: " + taskDuration[maxDurationIndex];
    }
    
    
    
    
}
