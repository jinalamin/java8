package com.yash.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BusinessLogic {

	// Using Stream with filter
	public static ArrayList<Employee> findByName(ArrayList<Employee> list, String name) {

//		list.stream().filter(
//				p -> name.equals(p.getName())).forEach(System.out :: println) ;

		ArrayList<Employee> l = (ArrayList<Employee>) list.stream().filter(p -> name.equals(p.getName()))
				.collect(Collectors.toList());

		return l;

	}

	// Using stream with predicate 
	public static ArrayList<Employee> findByAge(ArrayList<Employee> list, int age) {

		
		Predicate<Employee> p = list1 -> (list1.age) == age;
		Predicate<Employee> negateExample = p.negate();
		System.out.println("--------------With Negate--------------");
		 list.stream().filter(negateExample).forEach(System.out :: println);;
		 System.out.println("------------------------------------------");
		ArrayList<Employee> l = (ArrayList<Employee>) list.stream().filter(p).collect(Collectors.toList());
		return l;
		
		
		
	}

	// Using stream with user defined consumer
	public static void findBySalary(ArrayList<Employee> list, int salary) {

		findSalaryUsingConsumer(list, l -> l.setSalary(l.getSalary() + 1));
	}

	public static void findSalaryUsingConsumer(ArrayList<Employee> list, Consumer<Employee> c) {
		for (Employee e : list) {
			c.accept(e);
			System.out.println(" new :" + e.getSalary());
		}
	}

	
	//Using Biconsumer
	public static void findByGender(ArrayList<Employee> list, char gender) {

		BiConsumer<ArrayList<Employee>, Character> bc = BusinessLogic::showDetailsUsingBiconsumer;
		bc.accept(list, gender);

	}

	public static void showDetailsUsingBiconsumer(ArrayList<Employee> list, char gender) {
		System.out.println(list.stream().filter(a -> a.getGender() == gender).collect(Collectors.toList()));
	}
	
	
	
	
}
