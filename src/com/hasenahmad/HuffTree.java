package com.hasenahmad;

import java.util.*;

public class HuffTree{
	//pop 2, combine, push back, sort
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
			Collections.reverse(stacky);
			System.out.println(stacky);
			stacky.push(combineLow(stacky.pop(), stacky.pop()));
		}
		stacky.push(combineLow(stacky.pop(), stacky.pop()));
			System.out.println(stacky);

	}

	private Node combineLow(Node a, Node b) {
		Node newRoot = new Node('*', a.getFrequency() + b.getFrequency());
		newRoot.setLeft(a);
		newRoot.setRight(b);
		return newRoot;
	}
	

	
	
}
