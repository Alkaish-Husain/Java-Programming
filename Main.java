package StudentManagementSystem.models;
import StudentManagementSystem.models.*; 
import java.util.*; 
import java.io.*; 

public class Main { 
	 
	 public static void main(String[] args) { 
	  Scanner sc = new Scanner(System.in); 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	        List<Student> students = new ArrayList<>(); 
	 
	        int choice; 
	        do { 
	            System.out.println("\n--- Student Management System ---"); 
	            System.out.println("1. Add Student"); 
	            System.out.println("2. Add Graduate Student"); 
	            System.out.println("3. Display All Students"); 
	            System.out.println("4. Show Student Count"); 
	            System.out.println("5. Exit"); 
	            System.out.print("Enter your choice:- "); 
	            choice = sc.nextInt(); 
	 
	            try { 
	                switch (choice) { 
	                    case 1: 
	                    System.out.print("Enter Name:- "); 
	                    String name = br.readLine(); 
	                    System.out.print("Enter Student ID:- "); 
	                    int id = sc.nextInt(); 
	                    sc.nextLine();  
	      System.out.print("Enter Age:- "); 
	                    int age = sc.nextInt(); 
	                    sc.nextLine(); 
	                    System.out.print("Enter Course:- "); 
	                    String course = br.readLine(); 
	 
	                    Student student = new Student(name, id, age, course); 
	                    students.add(student); 
	                    System.out.println("Student added successfully!"); 
	                    break; 
	 
	                    case 2: 
	                    System.out.print("Enter Name:- "); 
	                    String gname = br.readLine(); 
	                    System.out.print("Enter Student ID:- "); 
	                    int gid = sc.nextInt(); 
	                    sc.nextLine();                                    
	                    System.out.print("Enter Age:- "); 
	                    int gage = sc.nextInt(); 
	                    sc.nextLine(); 
	                    System.out.print("Enter Course:- "); 
	                    String gcourse = br.readLine(); 
	                   System.out.print("Enter Thesis Topic:- "); 
	                    String thesis = br.readLine(); 
	 
	                   GraduateStudent gradStudent = new 
	GraduateStudent(gname, gid, gage, gcourse, thesis); 
	                   students.add(gradStudent); 
	                   System.out.println("Graduate Student added successfully!"); 
	                   break; 
	 
	                    case 3: 
	                    System.out.println("\n--- Student Details ---"); 
	                    for (Student s : students) { 
	                       s.display();  
	                       System.out.println("--------------"); 
	                        } 
	                    break; 
	 
	                    case 4: 
	                    System.out.println("Total Students:- " + Student.getStudentCount()); 
	                    break; 
	 
	                    case 5: 
	                    System.out.println("Exiting..."); 
	                    break; 
	 
	                    default: 
	                    System.out.println("Invalid choice! Try again."); 
	                } 
	            } catch (Exception e) { 
	                System.out.println("Error:- " + e.getMessage()); 
	            } 
	 
	        } while (choice != 5); 
	 
	        sc.close(); 
	    } 
	 
	 
	} 
