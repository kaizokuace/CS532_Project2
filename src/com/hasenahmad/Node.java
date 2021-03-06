/**
 * @author Hasen Ahmad
 * CS532 Project 2
 * Huffman Coding
 */
package com.hasenahmad;

public class Node implements Comparable<Node> {
	/*--------------------Fields--------------------*/
	private char value;
	private int frequency;
	private Node left;
	private Node right;
	private String code;
	/*--------------------Constructor--------------------*/
	public Node(char value, int frequency){
		this.setValue(value);
		this.setFrequency(frequency);
	}
	/*--------------------Get/Set--------------------*/
	public char getValue() {return value;}
	public void setValue(char value) {this.value = value;}

	public int getFrequency() {return frequency;}
	public void setFrequency(int frequency) {this.frequency = frequency;}

	public Node getLeft() {return left;}
	public void setLeft(Node left) {this.left = left;}

	public Node getRight() {return right;}
	public void setRight(Node right) {this.right = right;}

	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	/*--------------------Overrides--------------------*/
	@Override
	public int compareTo(Node o) {
		if (getFrequency() > ((Node)o).getFrequency())
			return 1;
		else if (getFrequency() < ((Node)o).getFrequency())
			return -1; 
		else
			return 0;
	}
	@Override
	public String toString() {
		return " " + value + ":" + frequency + " " + code;
	}
}
