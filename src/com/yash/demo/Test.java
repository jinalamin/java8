package com.yash.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		//(String name, int id, int salary, Date dob, Date doj, String role,
		//int experience, Long mobileNumber,
		//char gender, int age)
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Olivia", 101, 20000, new Date(1993,8,12),new Date(2000,11,21), 
				"Admin", 3, (long) 99795456, 'F', 20));
		list.add(new Employee("Jacob", 102, 25000, new Date(1999,6,18),new Date(2000,12,22), 
				"HR", 1, (long) 99795456, 'M', 29));
		list.add(new Employee("Divya", 103, 10000, new Date(1984,6,12),new Date(2018,6,22), 
				"Tester", 7, (long) 99695456, 'F', 35));
		list.add(new Employee("Leo", 104, 29000, new Date(1993,8,12),new Date(2000,11,21), 
				"Admin", 3, (long) 99795456, 'M', 23));
		list.add(new Employee("Charlie", 105, 780000, new Date(1970,8,6),new Date(1991,5,29), 
				"Manager", 20, (long) 99795346, 'M', 50));
		list.add(new Employee("Harry", 106, 900000, new Date(1979,8,4),new Date(2016,1,30), 
				"Admin", 15, (long) 99795456, 'F', 26));
		list.add(new Employee("Frankie", 107, 30000, new Date(1999,8,12),new Date(2019,3,4), 
				"Trainee", 0, (long) 9979878, 'M', 19));
		
		
		
		
		Scanner sc =new Scanner(System.in);
		int ch,k;
		
//		BusinessLogic bl = new BusinessLogic();
		while (true) {
			System.out.println("1.Find by name ");
			System.out.println("2.Find by age");
			System.out.println("3.Find by DOJ");
			System.out.println("4.Find by Salary");
			System.out.println("5.Find by gender");
			System.out.println("6.Find by gender and age");
			System.out.println("Enter your choice : ");
			ch= sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Case 1 : find by name ");
//				BusinessLogic.findByName(list, "Leo");
				System.out.println("List: " +BusinessLogic.findByName(list, "Leo"));
				break;
				
			case 2:
				System.out.println("Case 2 : find by age");
				System.out.println("List: " +BusinessLogic.findByAge(list, 20));
				break;
				
			case 3:
				System.out.println("Case 3 : find by Salary");
				BusinessLogic.findBySalary(list, 50000);
				break;

			case 6:
				System.out.println("Case 6 : Find by gender and age");
				BusinessLogic.findByGender(list, 'M');
				break;

			default:
				break;
			}
		}
	}
}
