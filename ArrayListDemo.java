/*
 * 
 * Date: June 28, 2014 
 * Desc:   Prepare for the coding interview. 
 * 
 */



import java.io.*;
import java.util.*;

public class ArrayListDemo {
	
	public int dog = 2;  // instance variable
	 
	 public  void clobber() {
		 	int dog = 5;  // a different dog!
		 	System.out.println("\nThe dog local variable = "+ dog);
		 	System.out.println("The dog field = " + this.dog);
	 }
	 
	
	//ArrayList (Dynamically Resizing Array
	public static ArrayList<String> merge(String[] words, String[] more) {
			ArrayList<String> sentence =  new ArrayList<String>();
			for (String w : words) sentence.add(w);
			for (String w: more) sentence.add(w);
			return sentence;
	}
	
	public static void main(String[] args) {
		String[] words = {"Prepare", " for",  "interview:"};
		String[] more = {"Book name - Cracking", "the", "coding", "interview" };
		ArrayList<String> printList = new ArrayList<String>();
		printList = merge(words, more);
		System.out.println(printList);
		
		
		String bufferStr = joinwords(more);
		System.out.print(bufferStr);
		
		ArrayListDemo t = new ArrayListDemo();
		t.clobber();
		
		
	}
	//total time is O(xn^n)
	public static String joinwords_low(String[] words) {
		String sentence = " ";
		for (String w: words) {
			sentence = sentence + w;
		}
		return sentence;
	}
	
	
	//using StringBuffer simply creates an array of all the strings, 
	// Copying them back to a string only when necessary.
	public static String joinwords(String[] words) {
	   StringBuffer  sentence =  new StringBuffer();
		for(String w: words) { 
			sentence.append(w);			
		}
	   return sentence.toString();
	}
}
