package test;

import org.testng.annotations.BeforeMethod;

public class ZeroClass {
	
	public void runThis() {
		System.out.println("I am coming now");
	}
	
	@BeforeMethod
	public void beforeRun() {
		System.out.println("I will run before");
	}

}