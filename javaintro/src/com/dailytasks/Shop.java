package com.dailytasks;


public class Shop {

	public static void main(String[] args) {
		int totalMoney =450;
		int chocolatePrice =15;
		int cookiePrice =10;
		
		int cookies =5;
		int chocolates = 10;
		
		int chocolatecost=chocolatePrice*chocolates;
		int cookiescost=cookiePrice*cookies;
		
		int totalprice= chocolatecost+cookiescost;
		int remainingMoney=totalMoney-totalprice;
		
		System.out.println(totalprice);
		System.out.println(remainingMoney);
		
		
	}

}
