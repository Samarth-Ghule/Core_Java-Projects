package com.Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	void display() {
		Employee e1 = new Employee("1", "Samarth", "HR", 40000);
		Employee e2 = new Employee("2", "Aniruddh", "Developer", 65000);
		Employee e3 = new Employee("3", "Tejas", "Manager", 95000);
		Employee e4 = new Employee("4", "Anuj", "Developer", 75000);
		Employee e5 = new Employee("5", "Shree", "Tester", 45000);
		Employee e6 = new Employee("6", "Rahul", "Tester", 50000);
		Employee e7 = new Employee("7", "Rohan", "Developer", 65000);
		Employee e8 = new Employee("8", "Purva", "Tester", 45000);
		Employee e9 = new Employee("9", "Snehal", "Manager", 95000);
		Employee e10 = new Employee("10", "Ruchita", "Developer", 75000);
		Employee e11 = new Employee("11", "Sakshi", "Tester", 50000);
		Employee e12 = new Employee("12", "Pratiksha", "HR", 50000);
		Employee e13 = new Employee("13", "Ram", "Tester", 40000);
		Employee e14 = new Employee("14", "Suraj", "Developer", 65000);
		Employee e15 = new Employee("15", "Kabir", "Tester", 45000);

		List<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		al.add(e8);
		al.add(e9);
		al.add(e10);
		al.add(e11);
		al.add(e12);
		al.add(e13);
		al.add(e14);
		al.add(e15);

		System.out.println(">>> All Manager Name <<<");

		for (Employee emp : al) {

			if (emp.getDept() == "Manager") {
				System.out.println(emp.getName());
			}
		}
		System.out.println("--------------------------------------------------------------");

		System.out.println(">> Tester Salary After 20% Increase <<");
		for (Employee emp : al) {
			if (emp.getDept() == "Tester") {
				double salary = emp.getSalary() * 1.2;
				emp.setSalary(salary);
				System.out.println(emp);
			}

		}
		System.out.println("--------------------------------------------------------------");
		System.out.println(">>> Details Of Developers <<<");
		for (Employee emp : al) {
			if (emp.getDept() == "Developer") {
				System.out.println(emp);
			}

		}
		System.out.println("--------------------------------------------------------------");
		System.out.println(">>> foreach With Lamda Expression <<<");
		al.forEach(emp -> System.out.println(emp.getName()));

		System.out.println("--------------------------------------------------------------");
		System.out.println(">>> foreach with method Reference <<<");
		al.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		System.out.println(">>> Employee Name Include 'A' and 'a' Character <<<");

		for (Employee emp : al) {
			if (emp.getName().contains("A") || emp.getName().contains("a")) {
				System.out.println(emp.getName());

			}
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println(">>> Using Name Comparator <<<");
		System.out.println("**** Sorting according to Name *****");
		Collections.sort(al, new NameComparator());
		for (Employee emp : al) {
			System.out.println(emp.getName());
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println(">>> Using Salary Comparator <<<");
		System.out.println("**** Sorting according to Salary *****");
		Collections.sort(al, new SalaryComparator());
		for (Employee emp : al) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("**** Using StramAPI *****");
		al.stream().forEach(emp -> System.out.println(emp.getName()));

		System.out.println("--------------------------------------------------------------");
		System.out.println("**** Using ParallelStramAPI *****");
		al.parallelStream().forEach(emp -> System.out.println(emp.getName()));
		System.out.println("--------------------------------------------------------------");
		System.out.println("**** Using Iterator *****");
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.display();
	}
}
