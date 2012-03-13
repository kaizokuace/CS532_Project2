package com.hasenahmad;

import java.util.ArrayList;

public class HuffPuff {
	public static ArrayList<Node> listy = new ArrayList<Node>();
	public static ArrayList<Node> listy2 = new ArrayList<Node>();	

	public static void main(String[] args) {
		listy.add(new Node('A', 3));
		listy.add(new Node('B', 1));
		listy.add(new Node('C', 2));
		listy.add(new Node('D', 2));
		HuffTree huff = new HuffTree(listy);
		huff.print();
		
		listy2.add(new Node('A', 20));
		listy2.add(new Node('B', 2));
		listy2.add(new Node('C', 5));
		listy2.add(new Node('D', 15));
		listy2.add(new Node('E', 10));
		listy2.add(new Node('F', 100));
		listy2.add(new Node('G', 80));
		listy2.add(new Node('H', 175));
		listy2.add(new Node('I', 150));
		listy2.add(new Node('J', 6));
		listy2.add(new Node('K', 100));
		HuffTree huff2 = new HuffTree(listy2);
		huff2.print();
	}

}
