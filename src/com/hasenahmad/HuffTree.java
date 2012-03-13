package com.hasenahmad;

import java.util.*;

public class HuffTree{
	//take in an array of Value class objects (this contains the value and frequency data pair)
	//sort this array from low to high
	//take the 2 lowest
	
	//pop 2, combine, push back, sort
	//ArrayList<Node> listy = new ArrayList<Node>();
	//Collections.sort
	private Stack<Node> stacky;
	
	public HuffTree(ArrayList<Node> nodeList){
		stacky = new Stack<Node>();
		Iterator<Node> itr = nodeList.iterator();
		while(itr.hasNext()){
			stacky.push(itr.next());
		}
		System.out.println(stacky);
		while(stacky.size() > 2){
			Collections.sort(stacky);
			System.out.println(stacky);
			stacky.push(combineLow(stacky.pop(), stacky.pop()));
		}
		stacky.push(combineLow(stacky.pop(), stacky.pop()));
	}

	private Node combineLow(Node a, Node b) {
		Node newRoot = new Node('*', a.getFrequency() + b.getFrequency());
		newRoot.setLeft(a);
		newRoot.setRight(b);
		return newRoot;
	}
	

	
	
}
