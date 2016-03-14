package com.examples.myproject;

import java.util.Scanner;

public class AnanyaTest {

	public static void main(String[] args){
		//System.out.println(getIntegerComplement(50));
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			int n = scanner.nextInt();
			int p = scanner.nextInt();
			try{
				System.out.println(power(n,p));
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			
		}
		
	}
	
	static int power(int n,int p) throws Exception {
		  if(n<0 || p<0) throw new Exception("n and p should be non-negative");
		  if(p==0) return 1;
		  return n*power(n,p-1);
	  }
	
	static int getIntegerComplement(int n)
	{
	    int complement = 0;
	    int i =0;
	    int reminder=0;
	    
	    if (n == 1){      
	        return 0;
	    }
	    else if(n == 0){
	        return 1;
	    }
	    while(n>1){
	    	reminder = n % 2;
	    	n= n / 2;
	    	if(reminder==0)
	    		complement= (int) (complement+1*Math.pow(2, i));
	    	i++;
	    }
	    if(n == 0)
	    {
	    	complement= (int) (complement+1*Math.pow(2, i));
	    }
	    
	    
	    return complement;
	    }
	
}
