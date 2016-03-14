package com.examples.myproject;

public class RearrangeWords {
	
	public String[] makeItLarge(String[] inp){
		
		String[] out = new String[inp.length];
		int count = inp.length;
		//For each String in array
		for(int i= 0;i<count;i++){
			//Get the character array for the String
			String word = inp[i];
			char[] chars = word.toCharArray();
			int counter = word.length()-1;
			boolean swapped =false;
			while(counter>0){				
				if(Character.toLowerCase(chars[counter-1]) < Character.toLowerCase(chars[counter])){
					char c = chars[counter-1];
					chars[counter-1] = chars[counter];
					chars[counter] = c;
					swapped = true;
					break;
				}
						
				counter --;
			}
			if(swapped)
				out[i] =  new String(chars);
			else
				out[i] = "no answer";
		}
		
		return out;
		
	}
	
	public static void main(String[] args){
		RearrangeWords r = new RearrangeWords();
		String[] inp = {"xy","pp","hefg","xsfqmabh"};
		String[] out = r.makeItLarge(inp);
		
		for(int i =0;i<out.length;i++){
			System.out.println(out[i]);
		}
	}

}
