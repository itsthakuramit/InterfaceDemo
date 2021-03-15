package com.stackroute.mar15demos;

public interface Browser {

	int currentyear=2021;
	
	public void openBrowser();
	public void closeBrowser();
	public void maximizeBrowser();
	public void resizeBrowser();
	
	default String checkIt() {
		return "It works!!";
	}
	
	static void browserdemo() {
		System.out.println("Browser static method ");
	}
}
