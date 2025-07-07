package com.jbs.service;

public class ClassDemo {
	private String firstName;
	private String LastName;
	private int _age;

	public void Print() {
		System.out.println("Info Card\n");
		System.out.println("Age: " + this._age);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public void printValue(int s) {
		System.out.println(s);
	}

	public void printValues(int a, int b, int c) {
		System.out.print(a + "\t" + b + "\t" + c + "\n");
	}

	static int addNumbers(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}
