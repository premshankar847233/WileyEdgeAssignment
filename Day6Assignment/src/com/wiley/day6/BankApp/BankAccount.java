/**
 * 
 */
package com.wiley.day6.BankApp;

/**
 * @author prems
 *
 */
public class BankAccount extends RuntimeException{
	int accountId;
	String accountHolderName;
	 AccounType acc;
	 
	
	public BankAccount(int accountId, String accountHolderName, AccounType acc) {
		
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.acc = acc;
	}


	public  double calculateTotalInterest(double amount, int years){
		 try {
	         if (amount<0) {
	            String msg = "Ammount should not be negative";
	          throw new DepositAmountException(msg);
	           
	         }
	      }
	      catch(DepositAmountException e) {
	         e.printStackTrace();
	    
	      }
		 double total=0;
			total=(amount*years*acc.rate(acc))/100;
			
		 return total;
	}
}
