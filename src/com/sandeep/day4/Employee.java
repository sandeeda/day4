package com.sandeep.day4;

public class Employee {

	private double employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private final double specialAllowance=250.80;
	private final double housingRentAllowance=1000.50;


	public Employee()
	{

	}


	public Employee(double employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}



	public double calculateSalary()
	{
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*housingRentAllowance/100);
		System.out.println(salary);
		return salary;
	}


}
