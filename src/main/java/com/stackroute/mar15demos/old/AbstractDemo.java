package com.stackroute.mar15demos.old;

public abstract class AbstractDemo {
	
	AbstractDemo(){
		System.out.println("Inside Abstract class constructor");
	}
	
	abstract void demo();
	
	void nonabsdemo() {
		System.out.println("Inside Abstract demo - nonabsdemo");
	}
	
}
