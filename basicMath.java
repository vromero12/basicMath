package basicMath;

public class basicMath {

	private static boolean isOdd(int i) {
		if(i % 2==0) {
			return false;
		}
		if (i % 2==1)
			return true;


	public static int factorial(int i) {
		if(i==1)
			return 1;
		return i*factorial(i-1);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
