package com;
import java.util.Iterator;


public class treesetlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				java.util.TreeSet<Object> list = new java.util.TreeSet<Object>();
				list.add("krupa");
				list.add("sharsoo");
				
				list.add("maalu");
				list.add("achu");
				list.add("stegy");
				list.add("diya");
				list.add("7080");
				list.add("125");
				
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