/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

/**
 *
 * @author garps
 */
public class FullTimer extends Employee implements SalaryDetails{
    private String assignedOffice;

    public FullTimer(String assignedOffice, String name) {
        super(name);
        this.assignedOffice = assignedOffice;
    }

    public String computeSalary(String salaryAmount){
       return salaryAmount;
    }
    
    public void writeEmployeeDescription()
    {
        
    }
}
