package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {

		int empIsPresent = (int) (Math.floor(Math.random() * 10) % 2);
		int empWage = 0;
		if (empIsPresent == 1) {
			System.out.println("Employee is Present");

		} else {
			System.out.println("Employee is Absent");
		}

	}

}
