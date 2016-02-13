package com.examples.myproject;

import java.util.concurrent.Callable;

public class SumUtil implements Callable<Integer>{

	int x;
	int y;
	
	public SumUtil(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return x + y;
	}
	
	

}
