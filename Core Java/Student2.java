package com.Student;

public class Student2 {

    int rollNo;
    String name;
    int marks;

    // Static Block
    static {
        System.out.println("College Name: Sir C R Reddy College of Engineering");
    }

    // Instance Block
    {
        System.out.println("Student object created");
    }

    // Constructor
    Student2(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Instance Method
    void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Static Method
    static void displayCollegeDetails() {
        System.out.println("College: Sir C R Reddy College of Engineering");
    }

    public static void main(String[] args) {

        // Calling static method
        Student2.displayCollegeDetails();

        // Creating first Student object
        Student2 s1 = new Student2(101, "Chandu", 85);

        // Creating second Student object
        Student2 s2 = new Student2(102, "Ravi", 90);

        System.out.println("\nStudent 1 Details:");
        s1.displayStudentDetails();

        System.out.println("\nStudent 2 Details:");
        s2.displayStudentDetails();
    }
}