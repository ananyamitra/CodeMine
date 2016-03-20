package com.practice.examples;

public class MergeArrays {
	
	public int[] mergeArrays(int[] a, int[] b){
		
		int[] mergedArr = new int[a.length + b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i] < b[j])
				mergedArr[k++] = a[i++];
			else
				mergedArr[k++] = b[j++];
		}
		while(i<a.length){
			mergedArr[k++] = a[i++];
		}
		while(j<b.length){
			mergedArr[k++] = b[j++];
		}
		return mergedArr;
	}

}
