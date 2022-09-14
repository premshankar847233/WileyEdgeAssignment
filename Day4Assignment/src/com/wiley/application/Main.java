package com.wiley.application;

import com.wiley.model.BankAccount;
import com.wiley.service.BankAccountService;

public class Main {

	public static void main(String[] args) {
		
		BankAccountService account1 = new BankAccountService("123456","Prem Shankar Kumar",23456.9);
		System.out.println(account1);
		account1.withDrawAmount(234);
		System.out.println(account1);
	}

}
