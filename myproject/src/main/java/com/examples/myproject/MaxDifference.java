package com.examples.myproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxDifference {
	
	public int maxDifference(int[] numbers){
		
		List<Integer> diffResult =new ArrayList<Integer>();
		for(int i=0;i< numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				diffResult.add(numbers[j]-numbers[i]);	
			}
		}
		
		int max = Collections.max(diffResult);
		if(max <=0)
			return -1;
		else
			return max;
	}
	
	
	public static void main(String[] args){
		
		//int[] numbers ={10,12,17,5,19,34,2};
		int[] numbers ={10,8,6,5,3,2};
		MaxDifference diff = new MaxDifference();
		System.out.println(diff.maxDifference(numbers));
	}

}
