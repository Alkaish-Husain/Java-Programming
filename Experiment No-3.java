/*Experiment No.:- 3
* Aim:- 
* Create a Java program to model a student system that demonstrates
different types of inheritance:-
	• Use Single Inheritance where Student inherits from a Person.
	• Use Multilevel Inheritance by creating a GraduateStudent that extends
	  Student.
	• Demonstrate Method Overriding by redefining a method in subclasses.
	• Simulate Multiple Inheritance using interfaces to add extra features
	  like ScholarshipHolder and SportsPlayer.
	• Each class or interface should contribute additional information or
	  behavior to the student entity.
NAME:- Shaikh Alkaish Husain
UIN:- 241P088
Roll No.:- 44
CLASS:- SE COMP
DIV:- B
*/


package alkaish;
import java.util.Scanner;

// Base class
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name:- " + name);
    }
}

// Single Inheritance: Student inherits from Person
class SE_Student extends Person {
    protected int rollNumber;

    public SE_Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    // Overridable method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number:- " + rollNumber);
    }
}

// Multilevel Inheritance: PostGraduateStudent inherits from SE_Student
class PostGraduateStudent extends SE_Student {
    private String specialization;

    public PostGraduateStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber);
        this.specialization = specialization;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization:- " + specialization);
    }
}

// Interface 1: for multiple inheritance
interface ScholarshipHolder {
    void displayScholarshipAmount();
}

// Interface 2: for multiple inheritance
interface SportsPlayer {
    void displaySport();
}

// Class implementing multiple interfaces
class AllRounderStudent extends PostGraduateStudent implements ScholarshipHolder, SportsPlayer {
    private double scholarshipAmount;
    private String sport;

    public AllRounderStudent(String name, int rollNumber, String specialization,
                             double scholarshipAmount, String sport) {
        super(name, rollNumber, specialization); // call parent constructor
        this.scholarshipAmount = scholarshipAmount;
        this.sport = sport;
    }

    @Override
    public void displayScholarshipAmount() {
        System.out.println("Scholarship Amount:- $" + scholarshipAmount);
    }

    @Override
    public void displaySport() {
        System.out.println("Sport:- " + sport);
    }

    // Overriding displayInfo to add more details
    @Override
    public void displayInfo() {
        super.displayInfo(); // call PostGraduateStudent's displayInfo
        displayScholarshipAmount();
        displaySport();
    }
}

// Main class to run the demo
public class Experiment_3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("=== PostGraduate Student Info ===");
        System.out.print("Enter Name:- ");
        String pgname = sc.nextLine();
        System.out.print("Enter Roll Number:- ");
        int pgRoll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Specialization:- ");
        String pgSpec = sc.nextLine();

        PostGraduateStudent gradStudent = new PostGraduateStudent(pgname, pgRoll, pgSpec);

        // Display PostGraduate Student Info
        System.out.println("\n=== Enter PostGraduate Student Info ===");
        gradStudent.displayInfo();
        

        System.out.println("\n===Enter  All-Rounder Student Info ===");
        System.out.print("Enter Name:- ");
        String arName = sc.nextLine();
        System.out.print("Enter Roll Number:- ");
        int arRoll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Specialization:- ");
        String arSpec = sc.nextLine();
        System.out.print("Enter Scholarship Amount:- ");
        double arScholar = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Sport:- ");
        String arSport = sc.nextLine();

        AllRounderStudent allRounder = new AllRounderStudent(arName, arRoll, arSpec, arScholar, arSport);

        // Display All-Rounder Student Info
        System.out.println("\n=== All-Rounder Student Info ===");
        allRounder.displayInfo();

        sc.close();
    }
}
