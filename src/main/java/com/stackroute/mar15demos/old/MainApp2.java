package com.stackroute.mar15demos.old;

public class MainApp2 {
	
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public int sum(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
    public static void main( String[] args ){
        
    	MainApp2 mainApp = new MainApp2();
    	System.out.println(mainApp.sum(10, 20));
    	System.out.println(mainApp.sum(10, 20,30));
    }
    
    
    
}
