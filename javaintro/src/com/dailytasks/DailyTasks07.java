package com.dailytasks;

public class DailyTasks07 {
	static int add(int a,int b){
		return a+b;
	}
	static int Sub(int a,int b){
		return a-b;
	}
	static int Mul(int a,int b){
		return a*b;
	}
	static int Div(int a,int b){
		return a/b;
	}
	public static void main(String[] args) {
		
		int a=2;
		int b=4;
		int addition=add(a,b);
		int Subtraction=Sub(a,b);
		int Multiply=Mul(a,b);
		int Divide=Div(a,b);
		
		System.out.println(addition);
		System.out.println(Subtraction);
		System.out.println(Multiply);
		System.out.println(Divide);
	}

}

