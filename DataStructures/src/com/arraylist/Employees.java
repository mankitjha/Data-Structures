package com.arraylist;

public class Employees {
	
	private String firstName;
	private String lastName;
	private int id;
	
	public Employees(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	
}
