/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

import com.group4.libraries.FullTimer;
import com.group4.libraries.Department;

/**
 *
 * @author John Mark Garcia
 */
public class EmployeeList {
    
    public void createFullTimerEmployee
        (
            String fullTimerAssignedOffice,
            String departmentDepartmentName,
            String departmentPosition,
            boolean isPerformanceGraded,
            int performancePerformanceRating,
            String salaryDetailsSalaryAmount
        )
    {
        // Full Timer Class
        FullTimer fullTimer = new FullTimer(fullTimerAssignedOffice, "Employee");
        // Department Class
        fullTimer.setDepartment(new Department());
        fullTimer.getDepartment().setDepartmentName(departmentDepartmentName);
        fullTimer.getDepartment().setPosition(departmentPosition);
        // Performance Class
        if (isPerformanceGraded == true)
        {
            fullTimer.setPerformance(new Performance(performancePerformanceRating));
            fullTimer.getPerformance().indicatePerformanceStatus();
        }
        // Salary Details Class
        fullTimer.employeeDescription = "Salary: " + fullTimer.computeSalary(salaryDetailsSalaryAmount) +
                " Assigned Office: " + fullTimer.getAssignedOffice();
    }
}
