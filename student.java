package com;

import java.io.Serializable;

public class student implements Serializable {
	int marks;
	String name;
	int mobileno;
	
	student(int x, String y,int z){
		marks=x;
		name=y;
		mobileno=z;
		
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
}