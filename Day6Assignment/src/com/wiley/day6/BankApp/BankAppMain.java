package com.wiley.day6.BankApp;

public class BankAppMain {
	
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount(101,"Prem Shankar Kumar",AccounType.SAVINGS);
		System.out.println("Total interest is : "+ acc1.calculateTotalInterest(10000.00,5));

	}
}
