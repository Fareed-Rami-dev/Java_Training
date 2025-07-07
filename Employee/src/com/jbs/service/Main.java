package com.jbs.service;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 3;
		String a = "3";
		double b = 333.333242;
		float q = 3333.324242f;
		short w = 3;
		long ab = 333;
		char zz = '3';
		boolean flag = true;

		if (b > q) {
			System.out.println("44>23");
		} else {
			System.out.println("23>44");
		}

		if (b > q) {
			for (int i = 0; i < 3; i++) {
				System.out.println("R");
				System.out.println("\n");
			}
		} else if (b == q) {
			System.out.println("B==Q\n");
		} else {
			System.out.println("B<Q\n");
		}

		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		System.out.println("Printing the value of x\n");
		System.out.printf("The value of x is: %d\n", x);
		System.out.printf("The value of string hello is %s\n", "hello");
		System.out.printf("33.2 is %f\n", 33.2f);

		String z = "t5555t";
		z = "aa0655";
		System.out.println(z.toLowerCase());
		System.out.println(z.toUpperCase());
		System.out.flush();

		switch (x) {
			case 1: {
				System.out.println("Printing 1\n");
				break;
			}
			case 2: {
				System.out.println("Printing 2\n");
				break;
			}
			case 3: {
				System.out.println("Printing 3\n");
				break;
			}
			case 4: {
				System.out.println("Printing 4\n");
				break;
			}
			default: {
				System.out.println(">=5\n");
				break;
			}
		}

		System.out.println(3 + 4 - 5 * 9 / 2 % 2 >> 2 << 4 | 32 & 1931 ^ 492);
		System.out.println(~33);

		x += 33;
		x -= 32;
		x *= 4;
		x >>= 3;
		x <<= 3;
		x ^= 3;
		x /= 3;
		x %= 3;
		x = 3333;

		System.out.println(z.isEmpty());
		System.out.println(z.charAt(3));

		float r = (float) 33.433d;

		Employee emp1;
		emp1 = new Employee("3", 4, "4", false);

		Byte m;
		m = -120;
		boolean ww = true;
		int mmm = 3;
		long zzzz = mmm;
		int wsz = 0b11111;
		System.out.println(wsz);

		long ewq = 0xFFEDDFFF;

		Doctor d;
		System.out.println("Hwll");
	}
}
