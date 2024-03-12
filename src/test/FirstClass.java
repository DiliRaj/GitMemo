package test;

import org.testng.annotations.Test;

public class FirstClass extends ZeroClass{
	
	@Test
	public void testRun() {
		
		runThis();
		int a = 3;
		SecondClass sec = new SecondClass(a); //parameterized constructor
		System.out.println(sec.increment());
		System.out.println(sec.decrement());
	//	ThirdClass thr = new ThirdClass(a);---this step rejected by senior
		System.out.println(sec.multiplyThree());
		
	}

}
