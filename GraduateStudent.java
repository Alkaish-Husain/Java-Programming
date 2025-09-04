package StudentManagementSystem.models;

public class GraduateStudent extends Student { 
    private String thesisTopic; 

    public GraduateStudent(String name, int id, int age, String course, String thesisTopic) { 
        super(name, id, age, course);   
        this.thesisTopic = thesisTopic; 
    } 

    public String getThesisTopic() { return thesisTopic; } 
    public void setThesisTopic(String thesisTopic) {this.thesisTopic = thesisTopic; } 

    public void display() { 
        super.display(); 
        System.out.println("Thesis Topic:- " + thesisTopic); 
    } 
} 
