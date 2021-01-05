package com;
import java.util.Iterator;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
	list.add("krupa");
	list.add("sharsoo");
	
	list.add("maalu");
	list.add("achu");
	list.add("stegy");
	list.add("diya");
	list.add(7080);
	list.add(125);
	list.size();
	
	 for (Object friends:list) {
	System.out.println("list of data:" + friends);
	 }
	System.out.println(list.size());
		
	
	}
}
