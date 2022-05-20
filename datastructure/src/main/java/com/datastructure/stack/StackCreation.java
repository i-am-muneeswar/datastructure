package com.datastructure.stack;

public class StackCreation {

	public static void main(String[] args) {
		
		stackmy s=new stackmy(10);
		s.push(10);
		s.push(0);s.push(1000);s.push(1);s.push(10000);s.push(100);
		
		s.pop();
		s.print();

	}
	

}
class stackmy{
	
	int top;
	int size;
	int a[];
	stackmy(int size){
		this.size=size;
		a=new int[size];
		top=-1;
	}
	
	void push(int k) {
		if(isFull()) {
			System.out.println("stack overflow");
		}
		else {
			top++;
			a[top]=k;//a[++top]=k;
			System.out.println("created "+ k);
		}
	}

	 boolean isFull() {
		return top==size-1;
	}
	 
	 int pop() {
		 
		 if(isEmpty()) {
			 System.out.println("underflow");
			 return 0;
		 }
		 else {
			 int j=a[top];
			 top--;
			 System.out.println("Popped element is "+j);
			 return j;
		 }
		 
	 }

	 boolean isEmpty() {
		return top==-1;
	}
 
	 void print() {
	 int i=0;
	 for(i=0;i<=top;i++){
			 System.out.println(a[i]);
	 	}
	 
	 }

}
