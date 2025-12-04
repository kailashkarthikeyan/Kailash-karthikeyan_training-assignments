package oops;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student's name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter student's roll number: ");
        student.setRollNo(scanner.nextInt());

        System.out.print("Enter student's marks (0-100): ");
        int marks = scanner.nextInt();

        try {
            student.setMarks(marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please restart and enter valid marks.");
            scanner.close();
            return;
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Marks: " + student.getMarks());

        scanner.close();
    }

}

class Student {
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks should be between 0 and 100.");
        }
        this.marks = marks;
    }
}
