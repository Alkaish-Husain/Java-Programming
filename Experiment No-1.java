/*Experiment No.:- 1
  Aim:- To write a Java program to demonstrate the concept of classes and objects, 
       showcasing object-oriented programming principles such 
       as encapsulation and reuse of code. 
  Name:- Shaikh Alkaish Husain Ahmad Husain
  Roll No.:- 44
  UIN.:- 241P088
  Class :- S.E.(Computer)-B
*/
package alkaish;

import java.util.Scanner;

public class public_class_Lab_01 {
	public static void main(String[] args) {

	     Scanner sc = new Scanner (System.in);

	    
	     System.out.println("Enter details for Student 1:");
	        System.out.print("Name: ");
	        String name1 = sc.nextLine();
	        System.out.print("Roll Number: ");
	        int roll1 = sc.nextInt();
	        System.out.print("Grade: ");
	        char grade1 = sc.next().charAt(0);
	        sc.nextLine();
	        
	        Student student1 = new Student(name1, roll1, grade1);
	        
	        System.out.println("\nEnter details for Student 2:");
	        System.out.print("Name: ");
	        String name2 = sc.nextLine();
	        System.out.print("Roll Number: ");
	        int roll2 = sc.nextInt();
	        System.out.print("Grade: ");
	        char grade2 = sc.next().charAt(0);
	        Student student2 = new Student(name2, roll2, grade2);
	        
	        System.out.println("\n===== Student Details =====");
	        student1.displayDetails();
	        student2.displayDetails();

	        sc.close();
	 }
	}

	class Student {
	
	 private String name;
	 private int rollNumber;
	 private char grade;

	
	 public Student(String name, int rollNumber, char grade) {
	     this.name = name;
	     this.rollNumber = rollNumber;
	     this.grade = grade;
	 }

	 // Public method to display student details (Code Reuse)
	 public void displayDetails() {
	     System.out.println("Name:- " + name);
	     System.out.println("Roll Number:- " + rollNumber);
	     System.out.println("Grade:- " + grade);
	     System.out.println("----------------------");
	 }
	}

