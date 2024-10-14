/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

/**
 *
 * @author garps
 */
public class PartTimer extends Employee implements SalaryDetails {
    private String primaryAlternativeOccupation;

    public String getPrimaryAlternativeOccupation() {
        return primaryAlternativeOccupation;
    }

    public PartTimer(String primaryAlternativeOccupation, String name) {
        super(name);
        this.primaryAlternativeOccupation = primaryAlternativeOccupation;
    }

    @Override
    public String computeSalary(String salaryAmount){
        return salaryAmount;
    }
    
    public void  writeEmployeeDescription(){

    }
}
