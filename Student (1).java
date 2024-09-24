package assignment6;

import java.util.Date;

public class Student extends Person implements IPerson {
    private float gpa;
    private String major;

    // Constructor
    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    // Getters and Setters
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Implementing the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}