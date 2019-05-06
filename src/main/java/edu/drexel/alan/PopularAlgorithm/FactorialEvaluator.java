package edu.drexel.alan.PopularAlgorithm;

public class FactorialEvaluator {
	
	public static void main(String[] args) {
		int[] testinput = {0, 1, 2, 3, 4, 5, 10, 11};
		
		for (int i : testinput ) {
			try {
				long result = factorial(i);
				System.out.println("Factorial of " + i + " = " + result);
			}
			catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static long factorial(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("n must be > 0");
		}
		
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result*i;
		}
		return result;
		
	}

}
