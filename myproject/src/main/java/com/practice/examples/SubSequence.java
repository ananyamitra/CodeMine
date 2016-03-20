package com.practice.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSequence {
	
	 	String input;
	   StringBuilder cur;
	  List<String> subSequence = new ArrayList<String>();
	  private void next(int pos, int reminder) {
	    cur.append(input.charAt(pos));

	    if (reminder == 1) {
	    	System.out.println(cur);
	    	subSequence.add(cur.toString());
	    } else {
	      for (int i = pos + 1; i + reminder - 1 <= input.length(); i++)
	        next(i, reminder - 1);
	    }
	    cur.deleteCharAt(cur.length() - 1);
	    
	  }
	  
	public void buildSubSequences(String s){
		cur = new StringBuilder();
	    this.input = s;
	    for (int length = 1; length <= s.length(); length++)
	      for (int pos = 0; pos + length <= s.length(); pos++)
	        next(pos, length);
		
	    List<String> subSequence = this.subSequence;
	    Collections.sort(subSequence);
	    System.out.println("***********");
		System.out.println(subSequence);
	}
	
	public static void main(String[] args){
		//(new SubSequence()).buildSubSequences("abc");
		
		
		String s="abc";
		SubSequence sub = new SubSequence();
		String[] ans = sub.buildSubsequences(s);
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
		
		
		//s.subSequence(0, 1);
		
//		System.out.println(s.subSequence(0, 1));
//		System.out.println(s.subSequence(0, 2));
//		System.out.println(s.subSequence(0, 3));
//		System.out.println(s.subSequence(0, 4));
//		System.out.println(s.subSequence(1, 2));
//		System.out.println(s.subSequence(1, 3));
//		System.out.println(s.subSequence(1, 4));
//		System.out.println(s.subSequence(2, 4));
//		System.out.println(s.subSequence(3, 4));
		
	}
	
	public String[] buildSubsequences(String s){
	
		SortedSet<String> setA = new TreeSet<String>();
		
		for(int i =0; i < s.length();i++){
			for(int j=1; j<= s.length();j++){
				setA.add(s.subSequence(i, j).toString());
			}
		}
		
		return setA.toArray(new String[setA.size()]);
	}

	

}
