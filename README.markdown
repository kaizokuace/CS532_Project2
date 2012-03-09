CS532 Project 2
===============

Huffman Coding
--------------

You are going to create a program that demonstrates the basic Huffman coding algorithm. Your
program will do the following:

1.	Read a file containing characters and counts, as shown below.
2.	Construct a Huffman coding tree for the characters, based on the data from step 1. Note that __you are not required to use a Heap as part of your implementation.__
3.	Output a table showing each character, the number of occurrences of the character, and the computed Huffman codeword for the character. (Output the sequence of 0's and 1's as a character string.)
4.	Compute and output the average code word length (Lavg) as well as the compression rate (vs. 8-bit ASCII).

__You will submit 2 runs with the data specified below.

__Run #1 - Input File and Sample Output__

A:3  
B:1  
C:2  
D:2  

char			A	B	C	D  
frequency		3	1	2	2  
Huffman Code	1	000	001	01  
Lavg = 2.0  
CR = 0.75  

__Run #2 - Input File__

	A:20
	B:2
	C:5
	D:15
	E:10
	F:100
	G:80
	H:175
	I:150
	J:6
	K:100

Traversing a Huffman Tree to Obtain the Codewords
	
	void getCode(Node T, String S){
		if T is a leaf{
			the code for the character is the node T is now in string S, 
			so tuck this info away somewhere;
			
			return;
		}
		
		getCode(T->lchild, S + "0");
		getCode(T->rchild, S + "1");
	}
	
	getCode(root, "");

