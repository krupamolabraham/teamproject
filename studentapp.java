package com;
class A implements Runnable{
public void run() {
	for(int i =1;i<5;i++) {
		System.out.println("I value is:" +i);
	}
}
}
public class studentapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A a1 = new A();
 Thread t1 = new Thread (a1);
 t1.start();
	}

}
