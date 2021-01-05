package com;

import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1= new employee(101,"packin",23,"software engineer", 22000);
employee e2= new employee(102,"santhosh", 28,"engineer",38000);
 employee e3= new employee(103,"kumar", 25,"engineer", 12000);
java.util.ArrayList<employee> list = new java.util.ArrayList<employee>();
list.add(e1);
list.add(e2);
list.add(e3);
Iterator<employee> itr = list.iterator();
while (itr.hasNext()) {
	employee emp = itr.next();
	System.out.println("employee id:"+emp.empId);
	System.out.println("employee name:"+emp.Name);
	System.out.println("employee name:"+emp.Age);
	System.out.println("employee name:"+emp.Designation);
	System.out.println("employee name:"+emp.Salary);
	System.out.println("salary raised to:" +(emp.Salary+3000));
	System.out.println("");
	
}
	}

}
