package com.hasenahmad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {
	/*--------------------Fields--------------------*/
	private final File filey;
	private ArrayList<Node> listy;
	/*--------------------Constructor--------------------*/
	public FileParser(String file){
		filey = new File(file);  
		listy = new ArrayList<Node>();
	}
	/*--------------------Public Methods--------------------*/
	public final void processLineByLine() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader(filey));
		try {
			while ( scanner.hasNextLine() ){
				processLine( scanner.nextLine() );
			}
		}
		finally {
			scanner.close();
		}
	}
	public ArrayList<Node> getListy() {return listy;}
	/*--------------------Protected Methods--------------------*/
	protected void processLine(String line){
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter(":");
		if ( scanner.hasNext() ){
			String value = scanner.next();
			String frequency = scanner.next();
			listy.add(new Node(value.charAt(0), Integer.parseInt(frequency)));
			//log("Character is : " + quote(value.trim()) + ", and Frequency is : " + quote(frequency.trim()) );
		}
		else {
			log("Empty or invalid line. Unable to process.");
			}
	}
	/*--------------------Private Methods--------------------*/
	private static void log(Object aObject){
		System.out.println(String.valueOf(aObject));
	}  
	@SuppressWarnings("unused")
	private String quote(String aText){
		String QUOTE = "'";
		return QUOTE + aText + QUOTE;
	}
}
