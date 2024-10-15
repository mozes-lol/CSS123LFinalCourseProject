/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.group4.applications;

import com.group4.libraries.Employee;
import com.group4.libraries.FullTimer;
import com.group4.libraries.Department;

/**
 *
 * @author johnm
 */
public class Startup {

    public static void main(String[] args) {
        System.out.println("Starting program");
        FullTimer fullTimer = new FullTimer("Office Unit", "Employee");
        System.out.println(fullTimer.getAssignedOffice());
        fullTimer.setDepartment(new Department());
        fullTimer.getDepartment().setDepartmentName("Department Position");
        System.out.println(fullTimer.getDepartment().getDepartmentName());
    }
}
