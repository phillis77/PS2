package pkgMyInteger;

public class MyInteger {
private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		
		return (iValue % 2 == 0);
	}
	
	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		boolean isPrime = true;
		for (int i = 2 ; i < getiValue() && (isPrime); i++) {
			 if (getiValue() % i == 0) {
				 isPrime = false;
			 }
		}
		return isPrime;
	}
	
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	
	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	
	public  static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean isEquals(int iValue) {
		return (this.iValue == iValue);
	}
	public boolean isEquals(MyInteger myInt) {
		return isEquals(myInt);
	}

}
