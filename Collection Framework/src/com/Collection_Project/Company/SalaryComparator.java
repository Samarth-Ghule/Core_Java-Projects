package com.Company;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Double s1 = o1.getSalary();
		Double s2 = o2.getSalary();

		return (s1.compareTo(s2));
	}

}
