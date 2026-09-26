package com.learning.models;

/**
 * Student.java
 *
 * Belongs to package: com.learning.models
 * Demonstrates a public domain model class.
 */
public class Student {
    private String id;
    private String name;
    private double tuitionFee;

    public Student(String id, String name, double tuitionFee) {
        this.id = id;
        this.name = name;
        this.tuitionFee = tuitionFee;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        if (tuitionFee >= 0) {
            this.tuitionFee = tuitionFee;
        }
    }
}
