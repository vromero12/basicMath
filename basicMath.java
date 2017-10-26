package basicMath;

public class basicMath {
	
	public static boolean factor_3(int i) {
		if (i % 3 == 0)
			return true; 
		
			return false;
	}

	public static int factorial(int i) {
		if(i==1)
			return 1;
		return i*factorial(i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
