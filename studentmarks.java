package StudentMarks;
import java.util.*; 

public class studentmarks { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter number of students:- "); 
        int n = sc.nextInt(); 
 
        int[] marks = new int[n]; 
 
        System.out.println("Enter marks of " + n + " students:-"); 
        for (int i = 0; i < n; i++) { 
            System.out.print("Enter  maks of Student " + (i + 1) + ":- "); 
            marks[i] = sc.nextInt(); 
        } 
 
        System.out.println("\n--- Marks of Students ---"); 
        for (int i = 0; i < n; i++) { 
            System.out.println("Student " + (i + 1) + ":- " + marks[i]); 
        } 
 
        int sum = 0, highest = marks[0], lowest = marks[0]; 
        for (int mark : marks) { 
            sum += mark; 
            if (mark > highest) highest = mark; 
            if (mark < lowest) lowest = mark; 
        } 
        double average = (double) sum / n; 
 
        System.out.println("\n--- Results ---"); 
        System.out.println("Average Marks:- " + average); 
        System.out.println("Highest Marks:- " + highest); 
        System.out.println("Lowest Marks:- " + lowest); 
 
        Vector<Integer> aboveAvg = new Vector<>(); 
        for (int mark : marks) { 
            if (mark >= average) { 
                aboveAvg.add(mark); 
            } 
        } 
 
        System.out.println("\nMarks >= Average:- " + aboveAvg); 
 
        sc.close(); 
    }
}
