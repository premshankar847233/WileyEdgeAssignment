/**
 * 
 */
package com.wiley.day6;

/**
 * @author prems
 *
 */
public class ReverseString {

		public static void reverseStr(String str) {
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
			System.out.print(rev);
			
		}
		
		public static void main(String[] args) {
			String str="pallavi";
			reverseStr(str);
	    }
}
