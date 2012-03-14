package com.hasenahmad;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HuffPuff {
	public static ArrayList<Node> listy;
	public static ArrayList<Node> listy2;	

	public static void main(String[] args) throws FileNotFoundException {
		FileParser parsey = new FileParser("input1.txt");
		parsey.processLineByLine();
		listy = parsey.getListy();
		HuffTree huff = new HuffTree(listy);
		huff.print();
		
		System.out.println();

		FileParser parsey2 = new FileParser("input2.txt");
		parsey2.processLineByLine();
		listy2 = parsey2.getListy();
		HuffTree huff2 = new HuffTree(listy2);
		huff2.print();
		
		
	}

}
