/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

/**
 *
 * @author garps
 */
public class PartTimer extends Employee_legacy {
    private String primaryAlternativeOccupation;
    private final double hourlyRate = 500;// initialize ko for easy logic pwede rin tanggalin if decided na manually input yung hourly rate...
    private int hourWork;//DINAGDAG KO LANG kasi i trhink mas doable skain pero if may mas oaky kayu method feel free to suggest

    public String getPrimaryAlternativeOccupation() {
        return primaryAlternativeOccupation;
    }

    public PartTimer(String primaryAlternativeOccupation, int hourWork, String name) {
        super(name);
        this.primaryAlternativeOccupation = primaryAlternativeOccupation;
        this.hourWork = hourWork;
    }

    @Override
    public void computeSalary(){
        double Salary = hourlyRate * hourWork;
        System.out.println(name + "'s computed Salary is:" + Salary);
    }
    
    
    
    
    public void  writeEmployeeDescription(){
        // same dito di ko alam ginagawa pero ang iniisip ko lang dito is output of description correct me if im wrong babaguhin ko nalang
    }
}
