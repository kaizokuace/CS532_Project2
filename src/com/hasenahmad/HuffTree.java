/**
 * @author Hasen Ahmad
 * CS532 Project 2
 * Huffman Coding
 */
package com.hasenahmad;

import java.text.NumberFormat;
import java.util.*;

public class HuffTree{
	//pop 2, combine, push back, sort
	/*--------------------Fields--------------------*/
	private Stack<Node> stacky;
	private String stringy = "";
	private ArrayList<Node> list;
	private double lavg = 0;
	private double cr = 0;
	/*--------------------Constructor--------------------*/
	public HuffTree(ArrayList<Node> nodeList){
		list = nodeList;
		stacky = new Stack<Node>();
		Iterator<Node> itr = nodeList.iterator();
		while(itr.hasNext()){
			stacky.push(itr.next());
		}
		while(stacky.size() > 1){
			Collections.sort(stacky);
			Collections.reverse(stacky);
			stacky.push(combineLow(stacky.pop(), stacky.pop()));
		}
		getCode(stacky.peek(), stringy);
		getLavg();
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
	    	T.setCode(S);
	        return;
	    }
	    getCode(T.getLeft(), S + "0");
	    getCode(T.getRight(), S + "1");
	}
	private void getLavg(){
		for(Node x : list)
			lavg += x.getFrequency() * x.getCode().length();
		int totalChars = 0;
		for(Node x : list)
			totalChars += x.getFrequency();
		lavg /= (double)totalChars;
		cr = (8 - lavg) / 8;
	}
	/*--------------------Public Methods--------------------*/
	public void print(){
		System.out.format("%-14s%-14s%-10s \n","Character", "Frequency", "Code" );
		for(Node x : list)
			System.out.format("%-14c%-14d%-10s \n", x.getValue(), x.getFrequency(), x.getCode());
		NumberFormat percentFormater = NumberFormat.getPercentInstance();
		System.out.format("Lavg: %.2f \n", lavg);
		System.out.println("CR: " + percentFormater.format(cr));
		System.out.println();
	}
}
