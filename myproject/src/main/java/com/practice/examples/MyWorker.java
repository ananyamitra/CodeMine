package com.practice.examples;

public class MyWorker implements Runnable{
	
	private int number1;
	private int number2;
	
	public MyWorker(int x, int y){
		number1 = x;
		number2=y;
		
	}
	
	public int getSum(){
		return number1+number2;
	}
	
	public void run(){
		System.out.println("Running worker "+Thread.currentThread().getName());
	}

}
