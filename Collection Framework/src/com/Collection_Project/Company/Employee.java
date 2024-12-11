package com.Company;

public class Employee {
	private String empId;
	private String empName;
	private String empDept;
	private double empSalary;

	public Employee(String id, String name, String dept, double salary) {
		super();
		this.empId = id;
		this.empName = name;
		this.empDept = dept;
		this.empSalary = salary;
	}
	public Employee() {
		
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + empId + ", name=" + empName + ", dept=" + empDept + ", salary=" + empSalary + "]";
	}

	public String getId() {
		return empId;
	}

	public void setId(String id) {
		this.empId = id;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public String getDept() {
		return empDept;
	}

	public void setDept(String dept) {
		this.empDept = dept;
	}

	public double getSalary() {
		return empSalary;
	}

	public void setSalary(double salary) {
		this.empSalary = salary;
	}
}
