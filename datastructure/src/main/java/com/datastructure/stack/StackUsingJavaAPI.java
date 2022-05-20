package com.datastructure.stack;
import java.util.*;

public class StackUsingJavaAPI {

	public static void main(String[] args) {

		java.util.Stack<String> s = new java.util.Stack<String>();
		s.push("Vishnu");
		s.push("Riyaz");
		s.push("Muni");
		s.push("Riu");
		s.push("Shankor");
		
		System.out.println("Stack");
		
		for(String S:s) {
			System.out.println(S);
		}
		
		System.out.println("Stack peek element "+s.peek());
		
		s.pop();
		s.pop();
		
		System.out.println("Stack after pop");
		
		for(String S:s) {
			System.out.println(S);
		}

	}

}
