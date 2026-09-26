package com.learning.main;

// Importing classes from other packages
import com.learning.models.Student;
import com.learning.utils.Helper;

/**
 * MainApp.java
 *
 * Belongs to package: com.learning.main
 * Demonstrates:
 * 1. Importing classes from other user-defined packages.
 * 2. Using imported classes and calling static methods.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Java Packages & Imports In Action ===");

        // Using imported Student class from com.learning.models
        Student student = new Student("STU-101", "Grace Muthoni", 1450.75);

        // Using imported static Helper method from com.learning.utils
        String formattedTuition = Helper.getFormattedDollar(student.getTuitionFee());

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Tuition Fee: " + formattedTuition);

        // Direct fully qualified name without import (equivalent)
        String capitalizedMajor = com.learning.utils.Helper.capitalize("software engineering");
        System.out.println("Major (via fully qualified name): " + capitalizedMajor);
    }
}
