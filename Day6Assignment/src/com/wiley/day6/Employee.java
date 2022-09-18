package com.wiley.day6;

public class Employee {
	 int empId;
	 String empName;
	 Address empAddresses[];
	public Employee( int empId, String empName,Address empAddresses[]) {
		this.empId = empId;
		this.empName = empName;
		this.empAddresses = empAddresses;
	}
	public void display() {
		System.out.println("Employee id is "+empId);
		System.out.println("Employee name is "+empName);
		System.out.println("Employee temporary address is : "+empAddresses[0].flatNumber +" ,"+empAddresses[0].flatName+" ,"+empAddresses[0].roadName+", "+empAddresses[0].cityName);
		System.out.println("Employee permanent address is : "+empAddresses[1].flatNumber +" ,"+empAddresses[1].flatName+" ,"+empAddresses[1].roadName+", "+empAddresses[1].cityName);
	}


	public static void main(String[]args) {
		Address arr[]=new Address[2];
		arr[0]=new Address(101,"Tiwary house","new area road","Daltonganj");
		arr[1]=new Address(102,"Shanti Niketan","Vigyan Nagar","Kota");
		
		Employee obj=new Employee(50,"pallavi",arr);
		obj.display();
	}	
}
