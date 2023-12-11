package com.Day2;

import java.util.Scanner;

public class StudentDetails {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    
    public StudentDetails(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

 
    public StudentDetails(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }


    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Student's Id: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter Student's Name: ");
        String studentName = scanner.next();

        System.out.print("Enter Student's address: ");
        String studentAddress = scanner.next();

        System.out.print("Whether the student is from NIT(Yes/No): ");
        String nitInput = scanner.next();

        StudentDetails student;

    
        if (nitInput.equals("Yes")) {
            student = new StudentDetails(studentId, studentName, studentAddress);
        } else if (nitInput.equals("No")) {
            System.out.print("Enter the college name: ");
            String collegeName = scanner.next();
            student = new StudentDetails(studentId, studentName, studentAddress, collegeName);
        } else {
            System.out.println("Wrong Input");
            return;
        }

       
        System.out.println("Student id: " + student.getStudentId());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());

       
    }
}

