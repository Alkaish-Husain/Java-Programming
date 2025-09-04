/*Experiment No.:- 2
  Aim:- To write a Java program that demonstrates: Constructor Overloading – using 
        different constructors in the same class. Method Overloading – using methods 
        with the same name but different parameter lists. 
  Name:- Shaikh Alkaish Husain Ahmad Husain
  Roll No.:- 44
  UIN.:- 241P088
  Class :- S.E.(Computer)-B
 
*/
package alkaish;

import java.util.Scanner;

// Constructor Overloading
class Student1 {
	String name;
	int age;

	Student1() {
		name = "Unknown";
		age = 0;
	}

	Student1(String n) {
		name = n;
		age = 0;
	}

	Student1(String n, int a) {
		name = n;
		age = a;
	}

// Method to Display 
	void display(int studentNo) {
		System.out.println("Student:-  " + studentNo);
		System.out.println("Name:- " + name + "\nAge:- " + age);
		System.out.println("---------------------------");
	}

// Method Overloading
	void updatedetails(String n) {
		name = n;
	}

	void updatedetails(String n, int a) {
		name = n;
		age = a;
	}

}

public class Overloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student1 s1 = new Student1();

		System.out.print("Enter name for Student 2:- ");
		String name2 = sc.nextLine();
		Student1 s2 = new Student1(name2);

		System.out.print("Enter name for Student 3:- ");
		String name3 = sc.nextLine();
		System.out.print("Enter age for Student 3: ");
		int age3 = sc.nextInt();
		Student1 s3 = new Student1(name3, age3);

		System.out.println("\nDetails of Students created using Constructor Overloading:");
		s1.display(1);
		s2.display(2);
		s3.display(3);

		System.out.println("\t\t\t---Method Overloading---");

		sc.nextLine();

		System.out.print("Enter new name for Student 1:- ");
		String newName1 = sc.nextLine();
		s1.updatedetails(newName1);
		s1.display(1);

		System.out.print("Enter new name for Student 2:- ");
		String newName2 = sc.nextLine();
		System.out.print("Enter new age for Student 2:- ");
		int newAge2 = sc.nextInt();
		s2.updatedetails(newName2, newAge2);
		s2.display(2);

		sc.close();

	}
}
