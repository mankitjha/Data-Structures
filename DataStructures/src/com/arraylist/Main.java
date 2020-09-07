package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employees> employeeList = new ArrayList<>();
		employeeList.add(new Employees("Ankit", "Jha", 001));
		employeeList.add(new Employees("Divya", "Marathe", 002));
		employeeList.add(new Employees("Abhishek", "Revankar", 003));
		employeeList.add(new Employees("Ankur", "Shetty", 004));
		employeeList.add(new Employees("Chandan", "Jaiswal", 005));
		
		System.out.println("Printing all the values of the arraylist.");
		employeeList.forEach(employee -> System.out.println(employee));
		
		
		System.out.println("Printing value of a single element from the list");
		System.out.println(employeeList.get(1));
		
		System.out.println("Replacing old employee with new employee at specific index");
		employeeList.set(1,new Employees("Divya", "K Marathe", 002));
		
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println("Cheecking if employee list is empty");
		System.out.println(employeeList.isEmpty());
				
		System.out.println("To know the size of array list");
		System.out.println(employeeList.size());
		
		
	}

}
