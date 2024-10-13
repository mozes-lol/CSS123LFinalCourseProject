/*m
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

/**
 *
 * @author Bianca
 */
abstract class Employee implements SalaryDetails {
    protected String name;
    protected Department department;
    /* protected Performance performance; */
    protected String employeeDescription;
    public Employee(String name) {
        this.name = name;
    }
    // Constructor
    public void Employee(Department department /** Performance performance **/
    ) {
        this.department = department;
        /** this.performance = performance; **/
        this.employeeDescription = ""; // Can be set by subclasses later
    }
    // Abstract method to be implemented by subclasses
    public abstract void writeEmployeeDescription();
    // Getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Getter and setter for employeeDescription
    public String getEmployeeDescription() {
        return employeeDescription;
    }

    public void setEmployeeDescription(String employeeDescription) {
        this.employeeDescription = employeeDescription;
    }

    // Getter and setter for department
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Getter and setter for performance
    /**
     * public Performance getPerformance() {
     * return performance;
     * }
     * public void setPerformance(Performance performance) {
     * this.performance = performance;
     * }
     **/

}
