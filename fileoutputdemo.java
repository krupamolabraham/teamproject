package com;



	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class fileoutputdemo {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			
			try{
				FileOutputStream fos = new FileOutputStream ("abcd.txt");
				fos.write(68);
				fos.close();
				System.out.println("Hey, written data to file successfully");
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			FileOutputStream fos= new FileOutputStream("abcd.txt");
			String c="Hi, welcome to iprimed";
			byte b[]=c.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("You're done!!!!!!!!");
			
		}
}
