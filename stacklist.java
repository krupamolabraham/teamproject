package com;
import java.util.Iterator;
public class stacklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Stack<Object> list = new java.util.Stack<Object>();
	list.add("krupa");
	list.add("sharsoo");
	list.add("125");
	list.add("maalu");
	list.add("achu");
	list.add("stegy");
	list.add("diya");
	list.add("7080");
	 for (Object friends:list) {
	System.out.println("list of data:" + friends);
	 }
	System.out.println(list.size());
		
	
	}
}
