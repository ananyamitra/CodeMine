package com.examples.myproject;

public class BinarySearch {
	
	public int isPresent(Node n,int key){
		
		while(n!=null){
			if(key < n.key)
				n = n.left;
			else{
				if(key == n.key)
					return 1;
				n = n.right;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		BinarySearch search = new BinarySearch();
		
		Node n = new Node();
		n.key = 20;
		
		
		Node n1 = new Node();
		n1.key = 10;		
		n.left=n1;
		
		Node n2= new Node();
		n.right=n2;
		n2.key = 30;
		
		Node n11 = new Node();
		n1.left=n11;
		n11.key = 8;	
		
		
		Node n12 = new Node();
		n1.right=n12;
		n12.key = 12;
		
	
		Node n21= new Node();
		n2.left=n21;
		n21.key=25;
				
		Node n22= new Node();
		n2.right=n22;
		n22.key=40;
		
		System.out.println(search.isPresent(n, 30));
		System.out.println(search.isPresent(n, 10));
		System.out.println(search.isPresent(n,100));
	}

}

class Node{
	int key;
	Node left;
	Node right;
	
}