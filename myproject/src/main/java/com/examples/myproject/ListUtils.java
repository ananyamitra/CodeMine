package com.examples.myproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListUtils{
	
	public Integer calculateMin(List<Integer> numbers) throws Exception{
		
		if(numbers==null || numbers.size() == 0)
			throw new Exception("Null/Empty list passed");
		
		Collections.sort(numbers);
		
		return numbers.get(0);

	}
	
	public static void main(String[] args){
		
		List<Integer> numbers = new ArrayList<Integer>();
		ListUtils utils = new ListUtils();
		numbers.add(10);
		numbers.add(100);
		numbers.add(20);
		numbers.add(2);
		numbers.add(9);
		try {
			System.out.println(utils.calculateMin(numbers));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}