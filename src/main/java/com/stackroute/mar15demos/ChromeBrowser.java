package com.stackroute.mar15demos;

public abstract class ChromeBrowser implements Browser {
	
	public abstract void browserspecificnavigation(String browsertype);
	
	public void openBrowser() {
		System.out.println("Chrome browser - launch");
	}
	public void closeBrowser() {
		System.out.println("Chrome browser - Close");
	}
	public void maximizeBrowser() {
		System.out.println("Chrome browser - maximize");
	}
	public void resizeBrowser() {
		System.out.println("Chrome browser - resize");
	}
	
}
