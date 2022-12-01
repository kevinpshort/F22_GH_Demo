package wk14_Recursion;

public class NFactorial {

	public static void main(String[] args) {
		/*
		Implement a Java class, NFactorial with the vars int n and int factorial in main method
		Implement a class method, getNFactorial, that returns the value of 
		n! (that’s n-factorial, not n-exclamation point)
		Print the value of n! from the main method
		*/
		
		// Declare vars
		int n = 14;
		int factorial = getFactorial(n);
		System.out.println("Factorial: " + factorial);
	}
	
	public static int getFactorial(int n) {
		if (n > 0) {
			int x = n * getFactorial(n-1);
			System.out.println(x);
			return x;
		}
		else return 1;
	}

}
