package com.dailytasks;

public class TestLiterals02 {

	public static void main(String[] args) {
		float f1=123; //123.0
		float f2=0123; //83.0
		float f3=0x123; //291.0
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		//float f4=0123.5; //type mismatch: cannot convert from double to float
		float f5=0123.5f;
		//System.out.println(f4);
		System.out.println(f5); //123.5
		
		
		//float f6=0x123.5f;//Invalid hex literal number
		float f7=03457;
		float f8=0x3457;
		float f9=567f;
		float f10=123.9f;
		float f11=0456f;
				
		
		//System.out.println(f6);
		System.out.println(f7);//1839.0
		System.out.println(f8);// 13399.0
		System.out.println(f9);//567.0
		System.out.println(f10);//123.9
		System.out.println(f11);//456.0
	}

}
