package com.wiley.model;

public class BankAccount {
	private String accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private double totalBalance;
	
	public BankAccount(String bankAccountId, String accountHolderName, double openingBalance) {
		this.accountId = bankAccountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.totalBalance = openingBalance;
		this.currentBalance = openingBalance;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	private String getAccountId() {
		return accountId;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getOpeningBalance() {
		return openingBalance;
	}
	
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
}
