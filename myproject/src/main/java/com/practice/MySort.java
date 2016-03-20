package com.practice;

public class MySort {
	
	public static void main(String[] args){
		
		int[] arrayToSort = {2, 4, 3, 9, 12, 7};
		MySort  sorter = new MySort();
		//int[] arr = sorter.insertionSort(arrayToSort);
		int[] arr = sorter.selectionSort(arrayToSort);
		for(int i : arr)
			System.out.print(" "+i);
	}

	//Think of pass as the outer loop..ie there will be n passes for an array of size n
	
	//At ith pass, place ith smallest element at a[i]
	public int[] selectionSort(int[] a){
		
		for(int i = 0; i<a.length ; i++){
			int minIndex = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[minIndex])
					minIndex = j;					
			}

			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
		return a;
		
	}
	
	
	//Scan array from left to right, at every pass the point upto which array is traversed gets sorted
	public int[] insertionSort(int[] a){
		for(int i = 1; i< a.length; i++){
			int current = a[i];
			int j=i;
			
			//Loop through the all the earlier elements(which should be sorted)
			//and shift the larger elements to right, 
			while(j>=0 && current < a[j-1]){
				System.out.println(" "+i+ " j"+j);
			    a[j] = a[j-1];
				j--;
			}			
			//Place the current element in the proper location
			a[j] =  current;			
		}
		return  a;
	}
	
	
}
