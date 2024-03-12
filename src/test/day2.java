package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {
	
	@AfterTest
	public void trainLoan() {
		System.out.println("train");
	}
	
	@AfterMethod
	public void methodLoan() {
		System.out.println("I am last");
	}
	
	@BeforeMethod
	public void firstLoan() {
		System.out.println("I am first");
	}
	
	@Test(enabled = false)
	public void mobileLoan() {
		System.out.println("Mobile");
	}
	
	@Test(groups = {"Smoke"})
	public void autoLoan() {
		System.out.println("Auto");
	}
	
	@Test(dataProvider = "getData")
	public void debitLoan(String username, String password) {
		System.out.println("Debit");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "FirstSetUser";
		data[0][1] = "FirstPassword";
		data[1][0] = "SecondSetUser";
		data[1][1] = "SecondPassword";
		data[2][0] = "ThirdSetUser";
		data[2][1] = "ThirdPassword";
		return data;
	}
	
	

}
