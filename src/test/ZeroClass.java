package test;

import org.testng.annotations.BeforeMethod;

public class ZeroClass {
	
	public void runThis() {
		System.out.println("I am coming now");
		System.out.println("I am going now");
	}
	
	@BeforeMethod
	public void beforeRun() {
		System.out.println("I will run before");
	}
	
	public void beforeRunn() {
		System.out.println("I will run before");
	}

}
