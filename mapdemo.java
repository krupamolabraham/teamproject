package com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(101,"Santhosh");
		m.put(107,"Kumar");
		m.put(102,"Kumar");
		m.put(108,"Harry");
		m.put(103,"Johnson");
		m.put(106,"Johnson");
		m.put(105,"Kumar");
		m.put(104,"Kumar");
		
		
		for(Map.Entry ms:m.entrySet())
		{
			System.out.println(ms.getKey()+" "+ms.getValue());
			System.out.println("");
		}
	}

}