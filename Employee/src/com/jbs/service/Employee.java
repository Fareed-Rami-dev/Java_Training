package com.jbs.service;

public class Employee {

	private String _name;
	private int _age;
	private String _DOB;
	boolean _isMarried;

	void setName(String n) {
		this._name = n;
	}

	String getName() {
		return this._name;
	}

	void setAge(int age) {
		this._age = age;
	}

	int getAge() {
		return this._age;
	}

	void setDOB(String DOB) {
		this._DOB = DOB;
	}

	String getDOB() {
		return this._DOB;
	}

	void setIsMarriedStatus(boolean value) {
		this._isMarried = value;
	}

	boolean getIsMarriedStatus() {
		return this._isMarried;
	}

	public Employee() {
	}

	public Employee(String n, int age, String DOB, boolean isMarried) {
		this._name = n;
		this._age = age;
		this._DOB = DOB;
		this._isMarried = isMarried;
	}
}
