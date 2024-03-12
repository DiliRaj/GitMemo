package test;

public class SecondClass extends ThirdClass {
	
	int a; //global or class variable
	
	public SecondClass(int a) {
		super(a);     //super keyword should always be the 1st line of code in the constructor and without inheritance can't be used
		this.a = a;   //assigns the instance variable to the global variable
		
	}

	public int increment() {
		a = a+1;
		return a;
	}
	
	public int decrement() {
		a = a-1;
		return a;
	}

}
