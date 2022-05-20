package com.datastructure.stack;

class Stack{
	
	int max = 20;
	int a[];
	int top;
	int size;
	
	Stack(){
		a = new int[max];
		top = -1;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	boolean push(int x) {
		
		if(top>=max-1) {
			System.out.println("Stack Overflow");
			return false;
		}
		
		else {
			a[++top] = x;
			System.out.println(x+" is pushed into the stack");
			return true;
		}
		
	}
	
	int pop() {
		
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		else {
			int c = a[top];
			int d = a[--top];
			System.out.println(c+" data poped from stack");
			return d;
		}
		
	}
	
	int peek() {
		
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		else {
			int d = a[top];
			return d;
		}
		
	}
	
	void print() {
		for (int i=top;i>-1;i--) {
			System.out.println(a[i]);
		}
	}
	
}

public class StackUsingArray {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(4);
		s.push(7);
		s.push(3);
		s.push(1);
		
		System.out.println("Stack");
		s.print();
		
		System.out.println("Stack peek element is "+s.peek());
		
		s.pop();
		s.pop();
		
		System.out.println("Stack after pop");
		s.print();

	}

}

