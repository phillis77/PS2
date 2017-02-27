package pkgMyinteger;
public class MyInteger {
	private int iValue;
	public MyInteger(int num){
		iValue=num;
	}
	public int get(){
		return iValue;
	}
	public boolean isEven(){
		if (iValue%2==0){
			return true;
		}
		else{
		return false;
		}
	}
		
	public boolean isOdd(){
		if (iValue%2!=0){
			return true;
		}
		else{
		return false;
		}
	}
	public boolean isPrime(){
		
		for (int i=2; i<iValue; i++ ){
			if(iValue % i==0 ){
				return false;
			}
					
		}
		return true;
		
			

	}
	public static boolean isEven(int iValue){
		if (iValue%2==0){ 
			return true;
		}
		else{
		return false;
		}
	}
	public static boolean isOdd(int iValue){
		if (iValue%2!=0){
			return true;
		}
		else{
		return false;
		}
	}
	
	
	public static boolean isPrime(int iValue){
		for (int i=2; i<iValue; i++ ){
			if(iValue % i==0 ){
				return false;
			}
		}
		return true;
		
			
	}
	public static boolean isEven(MyInteger iValue){
		return iValue.isEven();
		
	}
	public static boolean isOdd(MyInteger iValue){
		return iValue.isOdd();
	}
	public static boolean isPrime(MyInteger iValue){
		return iValue.isPrime();
		
	}
	public boolean equals(int a){
		boolean equal1=this.iValue==a;
		return equal1;
	}
	public boolean equals(MyInteger b){
		boolean equal2=this.iValue==b.iValue;
		return equal2;
	}

}
