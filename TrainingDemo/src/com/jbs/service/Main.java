package com.jbs.service;

public class Main {

	public static void main(String[] args) {
        ClassDemo c1 = new ClassDemo();
        c1.setFirstName("Ahmad");
        c1.setLastName("Mazin");

        System.out.println("First Name: " + c1.getFirstName());
        System.out.println("Last Name: " + c1.getLastName());
        System.out.printf("%s= %d %c", "10+20+30", ClassDemo.addNumbers(10, 20, 30), '\n');
        System.out.println(c1.getClass().getName());
	}
}
