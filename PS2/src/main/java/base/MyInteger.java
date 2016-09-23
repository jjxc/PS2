package base;

public class MyInteger {

	//Made private so only accessible by the class
	private int iValue;
	
	//Set Constructor
	public MyInteger(int newValue) {
		this.iValue = newValue;
	}
	
	//get Method
	public Integer getiValue() {
		return iValue;
	}
	
	//First set of Methods
	public boolean isEven() {
		return isEven(iValue);
	}
	
	public boolean isOdd() {
		return isOdd(iValue);
	}
	
	public boolean isPrime() {
		return isPrime(iValue);
	}
	
	//First set of Static Methods
	public static boolean isEven(int i) {
		return (i % 2 == 0);
	}
	
	public static boolean isOdd(int i) {
		return (i % 2 == 1);
	}
	
	public static boolean isPrime(int i) {
		for (int n = 2; n < i/2; n++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Second set of Static Methods
	public static boolean isEven(MyInteger i) {
		return i.isEven();
	}
	
	public static boolean isOdd(MyInteger i) {
		return i.isEven();
	}
	
	public static boolean isPrime(MyInteger i) {
		return i.isPrime();
	}
	
	//Methods to check for equal
	public boolean equals(int i) {
		return (iValue == i);
	}
	
	public boolean equals(MyInteger i) {
		return equals(i.getiValue());
	}
	
	
}

