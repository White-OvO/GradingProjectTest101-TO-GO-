package GradingProject1;

public class testclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello ");
//Student class with id, name and grade as fields
class Student {
// private fields
private int id;
private String name;
private double grade;

// public constructor with parameters
public Student(int id, String name, double grade) {
 this.id = id;
 this.name = name;
 this.grade = grade;
}

// public getter methods
public int getId() {
 return id;
}

public String getName() {
 return name;
}

public double getGrade() {
 return grade;
}

// public setter methods
public void setId(int id) {
 this.id = id;
}

public void setName(String name) {
 this.name = name;
}

public void setGrade(double grade) {
 this.grade = grade;
}

// public toString method
public String toString() {
 return "Student[id=" + id + ", name=" + name + ", grade=" + grade + "]";
}
}


	}

}
