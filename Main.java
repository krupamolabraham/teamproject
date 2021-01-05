package com;
import java.util.*;
public class Main {
	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String name=" ";
				int Age=0;
				int Salary=0;
				int i;
				int hike=0;
				
			
				Clerk e1= new Clerk(name, Salary, hike)	;
				Manager e2= new Manager(name, Salary, hike)	;
				Programmer e3= new Programmer(name, Salary, hike);
				e1.display();
				e2.display();
				e3.display();
			}
			}
//raisewsalary()