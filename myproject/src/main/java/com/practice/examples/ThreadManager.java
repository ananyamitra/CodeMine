package com.practice.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManager {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		
//		for(int i=0;i<10;i++){
//			Thread t = new Thread(new MyWorker());
//			t.start();
//			
//		}
//		
//		
//		System.out.println("Running main");
		
		//Write a code to return 1o threads to calculate sum of 2 numbers, then add all these 10 values together
		
		
		ExecutorService executorPool = Executors.newFixedThreadPool(10);
		List<Future> futures = new ArrayList<Future>();
		for(int i=0;i<=9;i++){
	
			Future<Integer> sum = executorPool.submit(new SumUtil(2,4));
			futures.add(sum);
		}
		
		int sum = 0;
		for(Future<Integer> f : futures){
			sum = sum + f.get();
		}
		
		System.out.println(sum);
		
		
	}

}
