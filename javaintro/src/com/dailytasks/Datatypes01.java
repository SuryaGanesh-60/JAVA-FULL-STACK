package com.dailytasks;

public class Datatypes01 {
	Integer studentid;
	String name;
	Integer age;
	Double marks;
	Character grade;
	Boolean passed;
	
	public static void main(String[] args) {
		Datatypes01 d=new Datatypes01();
		d.studentid=21;
		d.name="chandu";
		d.age=23;
		d.marks=7.5;
		d.grade='A';
		d.passed=true;
		System.out.println(d.studentid);
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.marks);
		System.out.println(d.grade);
		System.out.println(d.passed);
		
	}

}
