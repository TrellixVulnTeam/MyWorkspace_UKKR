package com.test.programs.AbstractionTest;

public class StaticTest {
	
	 int counter;
	
	StaticTest() {
		
		counter++;
		
		System.out.println(counter);
		
	}

	public static void main(String[] args) {
		
		StaticTest stc1 = new StaticTest();
		StaticTest stc2 = new StaticTest();
		StaticTest stc3 = new StaticTest();
	
	}

}
