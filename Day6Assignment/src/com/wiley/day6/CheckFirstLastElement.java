/**
 * 
 */
package com.wiley.day6;
import java.io.*;
import java.util.*;
/**
 * @author prems
 *
 */
public class CheckFirstLastElement {
	public  static boolean checkEqualilty(int[]arr,int n) {
		 if(arr[0]==arr[n-1])
		   return true;
		 return false;
	   }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(n<6) {
				System.out.print("Enter length of an array greater than 5");
				return;
			}
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.print(checkEqualilty(arr,n));
		}

}
