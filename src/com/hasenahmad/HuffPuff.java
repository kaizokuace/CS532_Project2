package com.hasenahmad;

import java.util.ArrayList;

public class HuffPuff {
	public static ArrayList<Node> listy = new ArrayList<Node>();
	

	public static void main(String[] args) {
		listy.add(new Node('A', 3));
		listy.add(new Node('B', 1));
		listy.add(new Node('C', 2));
		listy.add(new Node('D', 2));
		HuffTree huff = new HuffTree(listy);
		String string = "";
		huff.getCode(huff.getRoot(), string);
		System.out.println("Listy: " + listy);
	}

}
