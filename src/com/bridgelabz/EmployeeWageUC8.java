package com.bridgelabz;

//Compute Employee Wage //for multiple companies - Note: Each Company has its own//wage, number of working days//and working hours per month
public class EmployeeWageUC8 {

	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int Is_PART_TIME = 1;
	static final int Is_FULL_TIME = 2;
	static final int WORKIG_DAY_PER_MONTH = 20;
	static final int TOTAL_WORKING_HOURS = 1;
	static final int WORKING_HOURS_PER_MONTH = 100;

	public static void main(String[] args) {
		int workingDays = 0;
		int totalWorkingHours = 0;
		int totalWage = 0;
		while (workingDays < WORKIG_DAY_PER_MONTH && totalWorkingHours < WORKING_HOURS_PER_MONTH) {
			int empPresent = (int) (Math.floor(Math.random() * 10) % 3); // number b/w 0 and 1
			int empWage = 0;

			if (empPresent == Is_PART_TIME) {
				System.out.println("Part time");
			} else if (empPresent == Is_FULL_TIME) {
				System.out.println("Full time");
			} else if (empPresent == 0) {
				System.out.println("Absent");
			}

			switch (empPresent) {
			case Is_PART_TIME:

				if (totalWorkingHours + PART_TIME_HOUR <= WORKING_HOURS_PER_MONTH) {
					empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
					totalWorkingHours = totalWorkingHours + PART_TIME_HOUR;
				}
				break;
			case Is_FULL_TIME:

				if (totalWorkingHours + FULL_DAY_HOUR <= WORKING_HOURS_PER_MONTH) {
					empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
					totalWorkingHours = totalWorkingHours + FULL_DAY_HOUR;
				}
				break;
			default:
				empWage = 0;

			}

			totalWage = totalWage + empWage;
			System.out.println("Total Wage for Day " + (workingDays + 1) + " = " + totalWage);
			workingDays++;
		}
		System.out.println("Total Working Days :" + workingDays);
		System.out.println("Total Working Hours :" + totalWorkingHours);
		System.out.println("Employee Wage :" + totalWage);

	}

}
