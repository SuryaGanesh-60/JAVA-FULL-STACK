package com.dailytasks;

public class TestLiteral01 {

	public static void main(String[] args) {
		int a1=10;
		int a2=123;
		
		//Decimal literals base =10, Range=0---9
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		// Octal Decimals base=8, Range=0-7
		// int a3=0932;// The literal 0932 of type int is out of range 
		int a4=2347;
		//System.out.println(a3);
		System.out.println(a4);
		
		//hexa decimal literals base=16, Range=0---16
		
		int a6=0x123;
		int a7=0x235d3;
		System.out.println(a6);
		System.out.println(a7);
		
		//binary literal base=2, Range=0--1
		
		int a8=0b101010101;
		int a9=0b011110;
		
		System.out.println(a8);
		System.out.println(a9);
	}

}
