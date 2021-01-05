package com;
import java.util.Iterator;

public class arraydequelist {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
					java.util.ArrayDeque<Object> list = new java.util.ArrayDeque<Object>();
					list.add("krupa");
					list.add("sharsoo");
					list.add(125);
					list.add("maalu");
					list.add("achu");
					list.add("stegy");
					list.add("diya");
					list.add(7080);
					
					
				/*
					Iterator<Object> itr=list.iterator();
					while(itr.hasNext()){
						System.out.println(itr.next());
					
					*/
					for(Object data: list) {
						System.out.println("List of data:"+data);
					}
		}
		
	}


