package com.yash.demo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BusinessLogic {

	// ----------------- Using Stream with filter-----------------
	public static ArrayList<Employee> findByName(ArrayList<Employee> list, String name) {

//		list.stream().filter(
//				p -> name.equals(p.getName())).forEach(System.out :: println) ;

		ArrayList<Employee> l = (ArrayList<Employee>) list.stream().filter(p -> name.equals(p.getName()))
				.collect(Collectors.toList());

		return l;

	}

	// ----------------- Using stream with predicate -----------------
	public static ArrayList<Employee> findByAge(ArrayList<Employee> list, int age) {

		Predicate<Employee> p = list1 -> (list1.age) == age;
		Predicate<Employee> negateExample = p.negate();
		System.out.println("--------------With Negate--------------");
		list.stream().filter(negateExample).forEach(System.out::println);
		;
		System.out.println("------------------------------------------");
		ArrayList<Employee> l = (ArrayList<Employee>) list.stream().filter(p).collect(Collectors.toList());

		return l;

	}

	// -----------------Using stream with user defined consumer-----------------
	public static void findBySalary(ArrayList<Employee> list, int salary) {
		findSalaryUsingConsumer(list, l -> l.setSalary(l.getSalary() + 1));
	}

	public static void findSalaryUsingConsumer(ArrayList<Employee> list, Consumer<Employee> c) {
		for (Employee e : list) {
			c.accept(e);
			System.out.println(" new :" + e.getSalary());
		}
	}

	// -----------------Using Biconsumer-----------------
	public static void findByGender(ArrayList<Employee> list, char gender) {
		BiConsumer<ArrayList<Employee>, Character> bc = BusinessLogic::showDetailsUsingBiconsumer;
		bc.accept(list, gender);
	}

	public static void showDetailsUsingBiconsumer(ArrayList<Employee> list, char gender) {
		System.out.println(list.stream().filter(a -> a.getGender() == gender).collect(Collectors.toList()));
	}

	public static List<LocalDate> getDatesBetweenUsingJava8(LocalDate startDate, LocalDate endDate) {

		long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween).mapToObj(i -> startDate.plusDays(i))
				.collect(Collectors.toList());
	}

	// -----------------Using Supplier-----------------
	public static void getMaxSalary(ArrayList<Employee> list) {
		Supplier<Integer> s = () -> 0;
		IntSupplier s1 = () -> 0;
		System.out.println("max :" + list.stream().mapToInt(Employee::getSalary).max().orElseGet(() -> 0));

	}
	
	public static void getFuction(ArrayList<Employee> list, String name ) {
//		Function<List<Employee>, String > f = list.stream().filter(p -> (p.getRole()).equals("HR")).map(Object::toString);
//		IntFunction<Integer> f= (x) -> x+0;
	}

}
