package pkgMain;

public class MyInteger {
	
	private int iValue;
	
	public int getiValue() {
		
		return iValue;
	}
 
	public MyInteger(int iValue) {
		
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		
		return (iValue % 2 == 0);
	}
	
	public static boolean isEven(int iValue) {
		
		MyInteger MyInt = new MyInteger(iValue);
		
		return MyInt.isEven();
	}
	
	public static boolean isEven(MyInteger MyInt) {
		
		return MyInt.isEven();
	} 
	
	public boolean isOdd() {
		
		return !isEven();
	}
	
	public static boolean isOdd(int iValue) {
		
		MyInteger MyInt = new MyInteger(iValue);
		
		return MyInt.isOdd();
	}
	
	public static boolean isOdd(MyInteger MyInt) {
		
		return MyInt.isOdd(); 
	} 
	
	public boolean isPrime() {
		
		return (iValue % 2 != 0 && iValue % 3 != 0);
	}
	
	public static boolean isPrime(int iValue) {
		
		MyInteger MyInt = new MyInteger(iValue);
		
		return MyInt.isPrime();
	}
	
	public static boolean isPrime(MyInteger MyInt) {
		
		return MyInt.isPrime();
	}
	
	public boolean isEquals(int iValue) {
		
		return (this.iValue == iValue);	
	}
	
	public boolean isEquals(MyInteger MyInt) {
		
		MyInteger MyInt1 = new MyInteger(iValue);
		
		return MyInt1.isEquals(iValue); 
		
	}
}
