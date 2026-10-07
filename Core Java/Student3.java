package com.Student;

public class Student3 {
	
	String name;
	int Marks;
	int rollno;
	
	static {
		System.out.println("Collegename=Sir C R Reddy College of Engineering");
	}
	
	{
		System.out.println("Student Object Created");
	}
	
	Student3(String name,int Marks,int rollno){
		this.name=name;
		this.Marks=Marks;
		this.rollno=rollno;
	}
	void display() {
		System.out.println("name:" +name);
		System.out.println("rollno:" +rollno);
		System.out.println("Marks:" +Marks);
	}
	
	static void displaycollegedetails() {
		System.out.println("College:Sir C R Reddy college of Engineering");
	}
	public static void main(String[] args) {
		Student3.displaycollegedetails();
		Student3 s1= new Student3("chandu", 101,23);
		s1.display();
	}

}

////Create a Student class using:
//
//* Static Block – Print college name.
//* Instance Block – Print "Student object created".
//* Instance Method – Display student details.
//* Static Method – Display college details.
//* Create 2 Student objects in main() and call all methods.
//* Student fields: rollNo, name, marks.