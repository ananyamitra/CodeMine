package com.examples.myproject;

import java.util.Scanner;

public class Solution{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNext()){
		String ip = scanner.next();
		MyRegex mr = new MyRegex(ip);
			System.out.println(mr.isMatches());
		}
		
//		Arithmetic a = new Adder();
//		System.out.print(a.add(40, 2)+" "+a.add(10, 3)+" "+a.add(15, 5));
	}
}