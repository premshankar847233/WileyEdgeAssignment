package com.wiley.service;
import com.wiley.model.*;
public class BankAccountService extends BankAccount{
	
	public BankAccountService(String bankAccountId, String accountHolderName, double openingBalance) {
		super(bankAccountId, accountHolderName, openingBalance);
	}
	
	public void depositAmount(double amount) {
		this.setCurrentBalance(this.getCurrentBalance() + amount);
		this.setTotalBalance(getTotalBalance() + amount);
	}
	
	public void withDrawAmount(double amount) {
		if(!this.checkEligibilityToWithDraw(amount)) return;
		this.setCurrentBalance(this.getCurrentBalance()-amount);
		this.setTotalBalance(this.getTotalBalance()-amount);
	}
	
	public void displayTotalBalance() {
		System.out.println("Total Balance is : " + this.getTotalBalance());
	}
	
	@Override
	public String toString() {
		return this.getAccountHolderName() + "Total Balance: "  + this.getTotalBalance();
	}
	
	private boolean checkEligibilityToWithDraw(double amountToWithDraw) {
		if(this.getTotalBalance() < amountToWithDraw) {
			System.out.println("Sorry!! You have insuffucient funds in account");
			return false;
		}
		return true;
	}
}
