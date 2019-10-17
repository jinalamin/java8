//package com.yash.demo;
//
//import java.util.ArrayList;
//import java.util.function.Predicate;
//
//interface fileration{
//
//	public boolean checkName(ArrayList<Employee> list,String name);
//}
//
//public class Case1FindByName {
//
//	/*
//	 * public static Predicate<Employee> p(){ return list ->
//	 * list.name.startsWith("a"); }
//	 */
//	
//
//	fileration filterMethod = (ArrayList<Employee> list, String name) -> {
//		for (Employee employee : list) {
//			if(employee.getName().contains(name)) {
//				return true;
//				
//			}
//
//		}
//		return false;
//	} ;
//
//	Predicate<ArrayList<Employee> > predi = fileration :: checkName;
//
//	//Normal Predicate
//	//	Predicate<Employee> p = (ArrayList<Employee> list) -> {
//	//		return list.stream().filter(list1->list1.getName().startsWith("a"))
//	//	}
//
//
//	//	public static Predicate<Employee> lessSalryPredicate() {
//	//		return Employee -> Employee.getSalary()<= 50000;	
//	//		}
//	//
//	//	public static void findbyName(ArrayList<Employee> list, Predicate<Employee> predicate) {}
//
//}
