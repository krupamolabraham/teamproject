package com;

import java.util.Iterator;
import java.util.Scanner;

public class Mainapp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int empId =0;
			String Name=" ";
			int Age=0;
			int Salary=0;
			String Designation=" ";
			int i;
			int hike=0;
			
			for(i=0;i<5;i++) {
				Scanner se= new Scanner(System.in);
				System.out.println("Employee id:");
				empId= se.nextInt();
			Scanner sa= new Scanner(System.in);
			System.out.println("Employee name:");
			Name= sa.next();
			Scanner sc= new Scanner(System.in);
			System.out.println("Employee Age:");
			Age= sc.nextInt();
			Scanner sd= new Scanner(System.in);
			System.out.println("Employee salary:");
			Salary= sd.nextInt();
			Scanner sb= new Scanner(System.in);
			System.out.println("Employee designation:");
			Designation= sb.next();
			Scanner sf= new Scanner(System.in);
			System.out.println("enter salary hike");
			hike= sf.nextInt();
			}
			
			employee e1= new employee(empId,Name,Age,Designation,Salary);	 
			employee e2= new employee(empId,Name,Age, Designation, Salary);
			
		java.util.ArrayList<employee> list = new java.util.ArrayList<employee>();
		list.add(e1);
		list.add(e2);
					
	Iterator<employee> itr=list.iterator();
		while(itr.hasNext()){
			employee emp= itr.next();
			System.out.println("employee name:"  +emp.empId);
			System.out.println("employee name:"  +emp.Name);
			System.out.println("employee age:"  +emp.Age );
			System.out.println("employee salary:"   +emp.Salary);
			System.out.println("employee designation:"   +emp.Designation);	
			System.out.println("employee designation:"   +hike);	
			System.out.println("salary raised to:" +(emp.Salary+hike));
			System.out.println(" ");
			
		}
		}
	}