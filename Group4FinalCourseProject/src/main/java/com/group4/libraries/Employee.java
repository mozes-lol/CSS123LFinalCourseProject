/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

/**
 *
 * @author garps
 */
abstract class Employee implements SalaryDetails {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
    
}
