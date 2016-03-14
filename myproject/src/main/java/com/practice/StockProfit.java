package com.practice;


/*
Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.

Write an efficient function that takes stockPricesYesterday 
and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};

getMaxProfit(stockPricesYesterday);

*/

public class StockProfit {
	
	public static void main(String[] args){
		
		int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
		StockProfit prof = new StockProfit();
		System.out.println(prof.getMaxProfit(stockPricesYesterday));
	}
	
	public int getMaxProfit(int[] stockPricesYesterday){
		
		int length = stockPricesYesterday.length;
		if(length<2){
			throw new IllegalArgumentException("There cannot be any profit calculated from single stock price");
		}
		
		int minPrice = stockPricesYesterday[0];
		int maxProfit = 0;
		
		for(int i=1; i< length; i++){
			int currPrice = stockPricesYesterday[i];
			
			minPrice = Math.min(currPrice, minPrice);
			
			int currProfit = currPrice - minPrice;
			
			maxProfit = Math.max(currProfit, maxProfit);			
			
		}
		
		return maxProfit;
	}
	

}
