package com.hasenahmad;

public class Node implements Comparable<Node> {
	private char value;
	private int frequency;
	private Node left;
	private Node right;
	public Node(char value, int frequency){
		this.setValue(value);
		this.setFrequency(frequency);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

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
		return " " + value + ":" + frequency + " ";
	}
}
