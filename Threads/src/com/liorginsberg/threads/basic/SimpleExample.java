package com.liorginsberg.threads.basic;

public class SimpleExample {
	
	public static void main(String[] args) {
		
		new Thread(new GetTimeThread()).start();
		
		new Thread(new DoSomthing("Calling a freind", 4000)).start();
		
		new Thread(new DoSomthing("Calling a freind", 8000)).start();
	}

}
