package com.examples.myproject;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();  
		System.out.println(single.hashCode());
		Singleton single1 = Singleton.getInstance();  
		System.out.println(single1.hashCode());
	}
}
