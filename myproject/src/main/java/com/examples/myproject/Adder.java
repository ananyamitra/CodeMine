package com.examples.myproject;

public class Adder implements Arithmetic{

	public Adder(){
		System.out.println("I implemented: "+ this.getClass().getInterfaces()[0].getSimpleName());
	}
	public int add(int a, int b) {
		return a+b;
	}

}
