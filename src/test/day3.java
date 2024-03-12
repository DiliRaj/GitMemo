package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void flightLoan(String urlName) {
		System.out.println("Flight");
		System.out.println(urlName);
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"Smoke"})
	public void busLoan() {
		System.out.println("API");
	}
	
	@BeforeSuite
	public void classLoan() {
		System.out.println("Class");
	}
	
	@BeforeClass
	public void grassLoan() {
		System.out.println("Grass");
	}
	
	@AfterClass
	public void plantLoan() {
		System.out.println("Plant");
	}

}
