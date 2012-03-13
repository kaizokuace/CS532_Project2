package com.hasenahmad;

import java.util.*;

public class HuffTree{
	//pop 2, combine, push back, sort
	/*--------------------Fields--------------------*/
	private Stack<Node> stacky;
	private String stringy = "";
	private ArrayList<Node> list;
	/*--------------------Constructor--------------------*/
	public HuffTree(ArrayList<Node> nodeList){
		list = nodeList;
		stacky = new Stack<Node>();
		Iterator<Node> itr = nodeList.iterator();
		while(itr.hasNext()){
			stacky.push(itr.next());
		}
		while(stacky.size() > 2){
			Collections.sort(stacky);
			Collections.reverse(stacky);
			stacky.push(combineLow(stacky.pop(), stacky.pop()));
		}
		stacky.push(combineLow(stacky.pop(), stacky.pop()));
			getCode(stacky.peek(), stringy);
	}
	/*--------------------Private Methods--------------------*/
	private Node combineLow(Node a, Node b) {
		Node newRoot = new Node('*', a.getFrequency() + b.getFrequency());
		newRoot.setLeft(a);
		newRoot.setRight(b);
		return newRoot;
	}
	private void getCode(Node T, String S){
	    if (T.getValue() != '*') {
	        //the code for the character in the node T is now in string S, 
	        //so tuck this info away somewhere;
	    	T.setCode(S);
	        return;
	    }
	    getCode(T.getLeft(), S + "0");
	    getCode(T.getRight(), S + "1");
	}
	/*--------------------Public Methods--------------------*/
	public void print(){
		System.out.println("Huffman Coding: " + list);
	}
}
