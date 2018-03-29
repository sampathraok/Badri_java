package com.sun.core;

public class HelloWorld {
	
	public int add(int x,int y) {
		if(y==0) {
			System.out.println("Divide by zero exception will occur");
			return 0;
		}
		else
			return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!!");
		HelloWorld hello = new HelloWorld();
		
		hello.add(10, 20);
		hello.add(20, 0);

	}

}
