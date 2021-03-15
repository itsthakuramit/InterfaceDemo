package com.stackroute.mar15demos;

public class HCLBrowser implements Browser {
	
	
	public void openBrowser() {
		System.out.println("HCLBrowser  - launch");
	}
	public void closeBrowser() {
		System.out.println("HCLBrowser - Close");
	}
	public void maximizeBrowser() {
		System.out.println("HCLBrowser - maximize");
	}
	public void resizeBrowser() {
		System.out.println("HCLBrowser - resize");
	}
	
	public String checkIt() {
		return "It works here in HCLBrowser!!";
	}
	
}
