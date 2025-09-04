package usman;

import java.util.Scanner;

/* AIM:
* Create a Java program to manage student information in a school.
* Each student has a name, roll number, and grade. We want to:
* 1. Store student data securely using encapsulation.
* 2. Reuse code by creating multiple student objects.
* 3. Display student details using a method.
* NAME: Shaikh  Alkaish Husain
* UIN: 241P088 
* Roll No: 44
* CLASS: SE COMP
* DIV: B
*/

// OOP Concept How it's used in the program
// Class Student is a class with attributes and methods.
class Student {
    // Private data members (Encapsulation)
    private String name;
    private int rollNumber;
    private char grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Public method to display student details (Code Reuse)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}

// Main class to test Student objects
public class usman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get details for first student
        System.out.println("Enter details for first student:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        
        System.out.print("Roll Number: ");
        int rollNumber1 = scanner.nextInt();
        
        System.out.print("Grade: ");
        char grade1 = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character
        
        // Get details for second student
        System.out.println("\nEnter details for second student:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Roll Number: ");
        int rollNumber2 = scanner.nextInt();
        
        System.out.print("Grade: ");
        char grade2 = scanner.next().charAt(0);
        
        // Creating student objects with user input
        Student student1 = new Student(name1, rollNumber1, grade1);
        Student student2 = new Student(name2, rollNumber2, grade2);
        
        System.out.println("\nStudent Details:");
        System.out.println("----------------------");
        
        // Displaying student details
        student1.displayDetails();
        student2.displayDetails();
        
        scanner.close();
    }
}
