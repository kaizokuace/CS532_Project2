package com.hasenahmad;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HuffPuff {
	public static ArrayList<Node> listy;
	public static ArrayList<Node> listy2;	

	public static void main(String[] args) throws FileNotFoundException {
		/*
		listy.add(new Node('A', 3));
		listy.add(new Node('B', 1));
		listy.add(new Node('C', 2));
		listy.add(new Node('D', 2));
		*/
		FileParser parsey = new FileParser("input1.txt");
		parsey.processLineByLine();
		listy = parsey.getListy();
		HuffTree huff = new HuffTree(listy);
		huff.print();
		System.out.println();
		/*
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
		*/
		FileParser parsey2 = new FileParser("input2.txt");
		parsey2.processLineByLine();
		listy2 = parsey2.getListy();
		HuffTree huff2 = new HuffTree(listy2);
		huff2.print();
	}

}
