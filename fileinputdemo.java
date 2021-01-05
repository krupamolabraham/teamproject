package com;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class fileinputdemo {
		

	public static void main(String[] args) throws IOException {

	try {
	FileOutputStream fos=new FileOutputStream("demo.txt");
	fos.write(65);
	fos.close();
	System.out.println("written");

	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	FileOutputStream fos=new FileOutputStream("demo.txt") ;
	String c="WELCOME TO WRITE AND READ DEMO" ;
	byte b[]= c.getBytes();
	fos.write(b);
	System.out.println("DONE");


	}

}
