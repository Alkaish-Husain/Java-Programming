package StudentManagementSystem.models;

public class Student { 
    private String name; 
    private int id; 
    private int age; 
    private String course; 

    private static int studentCount = 0; 

    public Student() { 
        studentCount++; 
    } 

    public Student(String name, int id, int age, String course) { 
        this.name = name; 
        this.id = id; 
        this.age = age; 
        this.course = course; 
        studentCount++; 
    } 

    public void setDetails(String name, int id, int age, String course) { 
        this.name = name; 
        this.id = id; 
        this.age = age; 
        this.course = course; 
    } 

    public void setDetails(String name, int id) { 
        this.name = name; 
        this.id = id; 
    } 

    public String getName() { return name; } 
    public int getId() { return id; } 
    public int getAge() { return age; } 
    public String getCourse() { return course; } 

    public void setName(String name) { this.name = name; } 
    public void setId(int id) { this.id = id; } 
    public void setAge(int age) { this.age = age; } 
    public void setCourse(String course) { this.course = course; } 

    public void display() { 
        System.out.println("Student ID:- " + id); 
        System.out.println("Name:- " + name); 
        System.out.println("Age:- " + age); 
        System.out.println("Course:- " + course); 
    } 

    public static int getStudentCount() { 
        return studentCount; 
    } 
} 
