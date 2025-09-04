package usman;

import java.util.Scanner;

/*AIM:
* Create a Java program to model a student system that demonstrates
different types of inheritance:
• Use Single Inheritance where Student inherits from a Person.
• Use Multilevel Inheritance by creating a GraduateStudent that extends
Student.
• Demonstrate Method Overriding by redefining a method in subclasses.
• Simulate Multiple Inheritance using interfaces to add extra features
like ScholarshipHolder and SportsPlayer.
• Each class or interface should contribute additional information or
behavior to the student entity.
NAME:- Shaikh Alkaish Husain
UIN: 241P088 Roll No: 44
CLASS: SE COMP
DIV: B
*/

//Base class
class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

//Single Inheritance: Student inherits from Person
class SE_Student extends Person {
    protected int rollNumber;
    
    public SE_Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }
    
    // Overridable method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}

//Multilevel Inheritance: GraduateStudent inherits from Student
class GraduateStudent extends SE_Student {
    private String specialization;
    
    public GraduateStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber);
        this.specialization = specialization;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

//Interface 1: for multiple inheritance
interface ScholarshipHolder {
    void displayScholarshipAmount();
}

//Interface 2: for multiple inheritance
interface SportsPlayer {
    void displaySport();
}

//Class implementing multiple interfaces
class AllRounderStudent extends GraduateStudent implements ScholarshipHolder, SportsPlayer {
    private double scholarshipAmount;
    private String sport;
    
    public AllRounderStudent(String name, int rollNumber, String specialization, 
                            double scholarshipAmount, String sport) {
        super(name, rollNumber, specialization);
        this.scholarshipAmount = scholarshipAmount;
        this.sport = sport;
    }
    
    @Override
    public void displayScholarshipAmount() {
        System.out.println("Scholarship Amount: $" + scholarshipAmount);
    }
    
    @Override
    public void displaySport() {
        System.out.println("Sport: " + sport);
    }
    
    // Overriding displayInfo to add more details
    @Override
    public void displayInfo() {
        super.displayInfo(); // call GraduateStudent's displayInfo
        displayScholarshipAmount();
        displaySport();
    }
}

//Main class to run the demo
public class usman_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get details for Graduate Student
        System.out.println("=== Enter Graduate Student Details ===");
        System.out.print("Name: ");
        String gradName = scanner.nextLine();
        
        System.out.print("Roll Number: ");
        int gradRollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Specialization: ");
        String gradSpecialization = scanner.nextLine();
        
        // Create GraduateStudent object
        GraduateStudent gradStudent = new GraduateStudent(gradName, gradRollNumber, gradSpecialization);
        
        // Get details for All-Rounder Student
        System.out.println("\n=== Enter All-Rounder Student Details ===");
        System.out.print("Name: ");
        String allRounderName = scanner.nextLine();
        
        System.out.print("Roll Number: ");
        int allRounderRollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Specialization: ");
        String allRounderSpecialization = scanner.nextLine();
        
        System.out.print("Scholarship Amount: $");
        double scholarshipAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Sport: ");
        String sport = scanner.nextLine();
        
        // Create AllRounderStudent object
        AllRounderStudent allRounder = new AllRounderStudent(allRounderName, allRounderRollNumber, 
                                                            allRounderSpecialization, scholarshipAmount, sport);
        
        // Display information
        System.out.println("\n=== Graduate Student Info ===");
        gradStudent.displayInfo();
        
        System.out.println("\n=== All-Rounder Student Info ===");
        allRounder.displayInfo(); // Runtime Polymorphism
        
        scanner.close();
    }
}

