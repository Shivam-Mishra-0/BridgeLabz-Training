package com.annotation.taskswithpriority;

public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Rajeev")
    void completeAssignment() {
        System.out.println("Assignment completed");
    }
}