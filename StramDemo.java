package com;

import java.util.*;
import java.util.stream.Collectors;

public class StramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<Integer>();
list.add(22);
list.add(44); //list.add(null);
list.add(42);
list.add(32);
list.add(21);
list.add(85);//list.add(null);
list.add(27);
list.add(45);
System.out.println(list);
List l1 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
System.out.println(l1);
List l2 = list.stream().map(x->x+x).collect(Collectors.toList());
System.out.println(l2);
//List l3 = list.stream().takeWhile(x->x%2==0).collect(Collectors.toList());
//System.out.println(l3);
//List l4 = list.stream().dropWhile(x->x%2==0).collect(Collectors.toList());
//System.out.println(l4);
//Stream.iterate(1, x->x<100, x->x+1).forEach(System.out::println);
//List l5 = list.stream().flatMap(e->Stream.ofNullable(e)).collect(Collectors.toList());
//System.out.println(l5);

	}

}
