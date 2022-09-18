/**
 * 
 */
package com.wiley.day6.BankApp;

/**
 * @author prems
 *
 */
public enum AccounType {
	
	SAVINGS ,CURRENT;
	
	public double rate(AccounType acc) {
		if(acc.equals(SAVINGS)) {
			return 6.54;
		}
		else {
			return 9;
		}
	}
}
