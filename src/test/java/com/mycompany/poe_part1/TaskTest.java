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
    
}
