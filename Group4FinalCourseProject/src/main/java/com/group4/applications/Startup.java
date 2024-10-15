/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.group4.applications;

import com.group4.libraries.EmployeeList;

/**
 *
 * @author johnm
 */
public class Startup {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        employeeList.newFullTimerEmployee("A", "B", "C", true, 85, "500");
        employeeList.newFullTimerEmployee("A", "B", "C", true, 85, "500");
        employeeList.newFullTimerEmployee("A", "B", "C", true, 85, "500");
        System.out.println(employeeList.getEmployeeList());
    }
}
