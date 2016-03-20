package com.practice.examples;

public class FrequencyCounter {

	public static void main(String[] args) {
		String line = "This phrase, contains... funny stuff";
		String[] words = line.split("\\b");
		for(String word : words){
			System.out.println("**"+word+"**");
		}
	}

}
