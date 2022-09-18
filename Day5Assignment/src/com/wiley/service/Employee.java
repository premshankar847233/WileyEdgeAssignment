package com.wiley.service;

import java.util.Collections;
import java.util.List;

import com.wiley.model.EmployeeModel;

public class Employee extends EmployeeModel implements Comparable<Employee>{

	public Employee(String empId, String empName,
			String empDept, double empBasicSalary) {
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.setEmpDept(empDept);
		this.setEmpBasicSalary(empBasicSalary);
		this.setEmpGrossSalary(this.calculateGrossSalary());
	}
	
	public double calculateGrossSalary() {
		double grossSalary = this.getEmpBasicSalary() + (0.12 * this.getEmpBasicSalary()) + (0.08*this.getEmpBasicSalary());
		return grossSalary;
	}
	
	@Override
	public String toString() {
		return this.getEmpId() + " " + this.getEmpName() + " " + this.getEmpDept() + " " + this.getEmpBasicSalary() + " " + this.getEmpGrossSalary();
	}
	
	public static void sortEmployee(List<Employee> listEmployee) {
		Collections.sort(listEmployee);
	}

	@Override
	public int compareTo(Employee o) {
		return Double.valueOf(this.getEmpGrossSalary()).compareTo(Double.valueOf(o.getEmpGrossSalary()));
	}
}
