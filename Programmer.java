package com;

import java.util.Scanner;

public class Programmer {

	String name;
	int Age;
	int Salary;
	String Desig;
	
	public Programmer(String x, int y, int z) {
		name=x;
		Age=y;
		Salary=z;
}
	public void display() {
		int hike=0;
		// TODO Auto-generated method stub
		Scanner sa= new Scanner(System.in);
		System.out.println("Programmer name:");
		name= sa.next();
		Scanner sc= new Scanner(System.in);
		System.out.println(" Age:");
		Age= sc.nextInt();
		Scanner sd= new Scanner(System.in);
		System.out.println("Salary:");
		Salary= sd.nextInt();
		Scanner se= new Scanner(System.in);
		System.out.println("Salary hike:");
		hike= sd.nextInt();
		System.out.println("clerk name:"  +name );
		System.out.println("Age:"  +Age );
		System.out.println("Salary:"   +Salary);
		System.out.println("Programmer name:"  +name );
		System.out.println(" Age:"  +Age );
		System.out.println("Salary hike:"   +(Salary+hike));
		System.out.println(" Salary:"   +Salary);
		
		/*
		 * System.out.println("employee designation:" +hike);
		 * System.out.println("The salary hike of "+(name)+" is " +(Salary+hike));
		 */
		System.out.println(" ");
}}