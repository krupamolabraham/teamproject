package com;

import java.util.Iterator;

public class prioritylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.PriorityQueue<Object> list = new java.util.PriorityQueue<Object>();
		list.add("30");
		list.add("49");
		list.add("90");
		list.add("456");
		list.add("125");
		
		
	/*
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		
		*/
		for(Object data: list) {
			System.out.println("List of data:"+data);
				
			
		}
	
	

	}}