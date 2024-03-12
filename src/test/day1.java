package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(dependsOnMethods = {"zeeLoan"})
	public void homeLoan() {
		System.out.println("hello");
	}
	
	@Test(groups = {"Smoke"})
	public void carLoan() {
		System.out.println("bye");
	}
	@BeforeTest
	public void bikeLoan() {
		System.out.println("bike");
	}
	
	@AfterSuite
	public void suiteLoan() {
		System.out.println("Suite");
	}
	
	@Parameters({"API/Key","Duplicate Url"})
	@Test
	public void zeeLoan(String key, String uname) {
		System.out.println("Here I come");
		System.out.println(key);
		System.out.println(uname);
	}

}
