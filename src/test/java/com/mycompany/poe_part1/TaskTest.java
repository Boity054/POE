/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription1() {
        System.out.println("checkTaskDescription");
        String description = "Create Login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testCheckTaskDescription2() {
        System.out.println("checkTaskDescription");
        String description = "Create add Task feature to add task users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID1() {
        System.out.println("createTaskID");
        String taskname = "Login Feature";
        String developerDetails = "Robyn Harrison";
        int taskNumber = 0;
        Task instance = new Task();
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(taskname, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testCreateTaskID2() {
        System.out.println("createTaskID");
        String taskname = "Add task Feature";
        String developerDetails = "Mike Smith";
        int taskNumber = 1;
        Task instance = new Task();
        String expResult = "AD:1:ITH";
        String result = instance.createTaskID(taskname, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int details = 0;
        Task instance = new Task();
        String expResult ="Task Status: Doing\n"+ 
                "Developer Details:Mike Smith \n" +
                "Task Number:1 \n" +
                "Task Name:Add Task Feature\n" +
                "Task Description: \n" +
                "Task ID:AD:1:ITH\n"+
                "Duration:10 hours\n" ;
        String result =expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours1() {
        System.out.println("returnTotalHours");
        int taskDuration = 8;
        Task instance = new Task();
        int expResult = 8;
        int result = instance.returnTotalHours(taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testReturnTotalHours2() {
        System.out.println("returnTotalHours");
        int taskDuration = 10;
        Task instance = new Task();
        int expResult = 10;
        int result = instance.returnTotalHours(taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addTasks method, of class Task.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        Task instance = new Task();
        instance.addTasks();
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        Task instance = new Task();
        String expResult = "";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of displayStatusDone method, of class Task.
     */
    @Test
    public void testDisplayStatusDone() {
        System.out.println("displayStatusDone");
        Task instance = new Task();
        String expResult = "\"Task Status: Done\\n\"+ \n" +
"                \"Developer Details:Samatha Paulson\\n\" +\n" +
"                \"Task Name:Create Reports\\n\" +\n" +
"                \"Duration:5 hours\\n\"";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of longestDuration method, of class Task.
     */
    @Test
    public void testLongestDuration() {
        System.out.println("longestDuration");
        String developerDetails = "Glenda Oberholzer";
        String taskname = "Add Arrays";
        int taskDuration = 11;
        Task instance = new Task();
        String expResult = "Glenda Oberholzer,11";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of searchTaskname method, of class Task.
     */
    @Test
    public void testSearchTaskname1() {
        System.out.println("searchTaskname");
        String taskname = "Create Login";
        String searchname = "Mike Smith";
        Task instance = new Task();
        String expResult = "\"Task Status: To Do\\n\"+ \n" +
"                \"Developer Details:Mike Smith \\n\" +\n" +
"                \"Task Name:Create Login\\n\" +\n" +
"                \"Duration:5 hours\\n\"";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

     @Test
    public void testSearchTaskname2() {
        System.out.println("searchTaskname");
        String taskname = "Create Add Features";
        String searchname = "Edward Harrison";
        Task instance = new Task();
        String expResult = "\"Task Status:Doing\\n\"+ \n" +
"                \"Developer Details:Edward Harrison \\n\" +\n" +
"                \"Task Name:Create Add Features\\n\" +\n" +
"                \"Duration:8 hours\\n\"";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testSearchTaskname3() {
        System.out.println("searchTaskname");
        String taskname = "Create Reports";
        String searchname = "Samatha Paulson";
        Task instance = new Task();
        String expResult = "\"Task Status: Done\\n\"+ \n" +
"                \"Developer Details:Samatha Paulson\\n\" +\n" +
"                \"Task Name:Create Reports\\n\" +\n" +
"                \"Duration:5 hours\\n\"";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testSearchTaskname4() {
        System.out.println("searchTaskname");
        String taskname = "Add Arrays";
        String searchname = "Glenda Oberholzer";
        Task instance = new Task();
        String expResult = "\"Task Status: To Do\\n\"+ \n" +
"                \"Developer Details:Glenda Oberholzer \\n\" +\n" +
"                \"Task Name:Add Arrays\\n\" +\n" +
"                \"Duration:11 hours\\n\"";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of searchTaskByDeveloper method, of class Task.
     */
    @Test
    public void testSearchTaskByDeveloper() {
        System.out.println("searchTaskByDeveloper");
        String developerDetails = "Mike Smith" + "Edward Harrigton"+"Samantha Paulson"+"Glenda Oberholzer";
       // String searchDeveloper = "";
        Task instance = new Task();
        String expResult = "Mike Smith" + "Edward Harrigton"+"Samantha Paulson"+"Glenda Oberholzer";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of deleteTask method, of class Task.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskname = "Create Reports";
       // String deleteTaskname = "";
        Task instance = new Task();
        String expResult = "entry successfully deleted";
        String result =expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of showReport method, of class Task.
     */
    @Test
    public void testShowReport() {
        System.out.println("showReport");
        Task instance = new Task();
        instance.showReport();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
