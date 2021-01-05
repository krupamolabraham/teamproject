package com;

import java.time.LocalDate;
import java.time.LocalTime;

interface A{
	void display();
	default void print() {
		
	}
}
public class Interfacedemo implements A{
	public void display() {
	System.out.println("This is implemented display method");
	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*Interfacedemo id = new Interfacedemo();
		//id.display();
		//id.print();
		//A.show();
		//*
		java.util.Date d= new java.util.Date();
		System.out.println(d);
		LocalDate Id = LocalDate.now( );
		System.out.println("today's date:" + Id.getDayOfMonth());
	LocalTime It = LocalTime.now();
	System.out.println("Today's time:"+It);
				A a1 =()->{   //lambda expression: makes code short
			
		System.out.println("this is lambda expression");
	};
	a1.display();
	}
}
