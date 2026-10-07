package com.Student;

public class Student {
	static void Method1() {
		System.out.println("method1");
//		Method2();
		
	}
	static void Method2() {
		System.out.println("method2");
//		Method3();
		
		
	}
	static void Method3() {
		System.out.println("method3");
		
	}
	void Method4(){
		System.out.println("Method4");
	}
	void Method5(){
		System.out.println("Method5");
	}
	
	static {
		Method1();
		Method2();
		Method3();
	}
	{
		Method4();
		Method5();
	}
	
	public static void main(String[] args) {
		new Student();

}
}






