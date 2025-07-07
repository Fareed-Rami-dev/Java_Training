package com.jbs_test;
import java.util.*;
public class main {
 public static void main(String[] args) {
	System.out.println("Start");

	String data="Hello World";
	System.out.println(">>"+data.charAt(0));
	char a='h';
	//data.charAt(0)=a;
	data=new String("Hello World");
	StringBuilder strBuild1=new StringBuilder("900");
	strBuild1.append("500");
	System.out.println(strBuild1);
	StringBuilder strBuild2= new StringBuilder("900");
	System.out.println(strBuild1.hashCode());
	System.out.println(strBuild1.hashCode());

}
}
