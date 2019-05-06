package edu.drexel.alan.PopularAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciEvaluator {

	public static void main(String[] args) {
		int[] input = {-1, 0, 1, 2, 3, 4, 10, 11};
		
		for (int i : input) {
			try {
			List<Integer> seq = fibonacci(i);
			System.out.println(seq);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}

	}
	
	private static List<Integer> fibonacci(int n) {
		
		if (n < 0) {
			throw new IllegalArgumentException("n must be larger than 0");
		}
		
		if (n == 0) {
			return new ArrayList<>();
		}
		
		if (n == 1) {
			return Arrays.asList(0);
		}
		
		if (n == 2) {
			return Arrays.asList(0, 1);
		}
		
		List<Integer> sequence = new ArrayList<>(n);
		sequence.add(0);
		n = n - 1;
		sequence.add(1);
		n = n - 1;
		
		while ( n > 0 ) {
			int a = sequence.get( sequence.size() - 1 );
			int b = sequence.get( sequence.size() - 2 );
			sequence.add(b+a);
			n = n - 1;
		}
		
		return sequence;
		
	}

}
