package com.group4.libraries;

public class Department {
    private String departmentName;
    private String position;

    // Constructor
    public void Department(String departmentName, String position) {
        this.departmentName = departmentName;
        this.position = position;
    }

    // Getter and setter for departmentName
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
