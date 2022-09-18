/**
 * 
 */
package com.wiley.day6;
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

/**
 * @author prems
 *
 */
public class EmailValidate {

	/**
	 * 
	 */
	public EmailValidate() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your email id : ");
		String s=sc.nextLine();
		try {
			
			    {
			        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
			                            "[a-zA-Z0-9_+&*-]+)*@" +
			                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
			                            "A-Z]{2,7}$";
			                              
			        Pattern pat = Pattern.compile(emailRegex);
			        if (s == null) {
			        	 String msg = "Email is invalid";
			        	 throw new EmailException(msg);
			        	 
			        }
			        	 else if(pat.matcher(s).matches()==false) {
			        		 String msg = "Email is invalid";
			          throw new EmailException(msg);}
			    
			        else {
			        	System.out.print("Your email address is valid");
			        }
			    }
		}
		catch(EmailException e){
			e.printStackTrace();
		}

	}

}
