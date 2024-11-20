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
    
    //method to display all of the tasks
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
    
   //method to display the for all tasks with the status of done
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
    
    //method to diaply the longest duration
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
    
    //method to search task by name 
    public String searchTaskname(String[] taskname,String searchname){
        for(int i=0 ;i < count ;i++){
           if(taskname[i].equalsIgnoreCase(searchname)) {
               return "Task found\n Taskname: "+ taskname[i] + "\nDeveloper: " + developer[i] +"Task Status: "+ taskStatus[i];
           }
        }
        return "Task not available";
    }
    
    //method to search for all tasks assigned to the developer
    public int searchTaskByDeveloper(String[] developer,String searchDeveloper){
        StringBuilder report = new StringBuilder("Tasks assigned to " + developer + ":\n");
        for (int i = 0; i < count; i++) {
            if (developer[i].equalsIgnoreCase(searchDeveloper)) {
                report.append("Task Name: ").append(taskname[i]).append("\n Task Status: ").append(taskStatus[i]).append("\n");
            }
        }
    return -1;
    }
    
    //method to delete a task
    public String deleteTask(String[] taskname,String deleteTaskname){
           for (int i = 0; i < count; i++) {
            if (taskname[i].equalsIgnoreCase(deleteTaskname)) {
                for (int k = i; k < count - 1; k++) {
                    taskname[k] = taskname[k + 1];
                    developer[k] = developer[k + 1];
                    taskID[k] = taskID[k + 1];
                    taskDuration[k] = taskDuration[k + 1];
                    taskStatus[k] = taskStatus[k + 1];
                }
                count--;
                return "Task successfully deleted";
            }
        }
        return "Task not Deleted";
    }
    
    
}
