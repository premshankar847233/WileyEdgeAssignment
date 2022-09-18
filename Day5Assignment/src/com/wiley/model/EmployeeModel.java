/**
 * 
 */
package com.wiley.model;

/**
 * @author prems
 *
 */
public class EmployeeModel {

	/**
	 * 
	 */
	
	private String empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;
	
	public EmployeeModel() {
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getEmpBasicSalary() {
		return empBasicSalary;
	}
	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}
	public double getEmpGrossSalary() {
		return empGrossSalary;
	}
	public void setEmpGrossSalary(double empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}
}
