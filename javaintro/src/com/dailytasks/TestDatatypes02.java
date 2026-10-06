package com.dailytasks;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestDatatypes02 {
	
	BigInteger bi;
	BigDecimal bd;
	
	Integer i=25678;
	String s;	
	Character c;
	public static void main(String[] args) {
		
		TestDatatypes02 t = new TestDatatypes02();
		t.bi= new BigInteger("1000000000000000000");
		
		t.bd= new BigDecimal("1000000000000000000000000000000000000");
		
		t.s= new String("Vcube Software");
		
		int i=10; // AutoBoxing....
		Integer i1 = i;
		
		
		int a=i; // Auto Un-boxing....
		System.out.println(a);
		
		System.out.println(i1);
		
		
		
		
		System.out.println("Main Method Started");
		System.out.println(t.bi);
		System.out.println(t.bd);
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(t.c);
		System.out.println("main method ended");
		
		
		
		

	}

}
