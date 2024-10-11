/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.libraries;

/**
 *
 * @author John Mark Garcia
 */
public class Performance {
    private int performanceRating;
    private String performanceStatus;

    public Performance(int performanceRating) {
        this.performanceRating = performanceRating;
    }
    
    public void indicatePerformanceStatus()
    {
        if (performanceRating > 100)
        {
            performanceStatus = "Error:RatingTooHigh";
            System.out.println("ERROR: PERFORMANCE RATING EXCEEDS BEYOND 100");
        }
        else if (performanceRating >= 90) {performanceStatus = "EE";}
        else if (performanceRating >= 70) {performanceStatus = "ME";}
        else if (performanceRating >= 0) {performanceStatus = "PIP";}
        else
        {
            performanceStatus = "Error:RatingTooLow";
            System.out.println("ERROR: PERFORMANCE RATING IS NEGATIVE");
        }
        
    }
}
