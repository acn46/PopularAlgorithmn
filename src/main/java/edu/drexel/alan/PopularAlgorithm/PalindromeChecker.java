package edu.drexel.alan.PopularAlgorithm;

public class PalindromeChecker {

	public static void main(String[] args) {
		String input[] = {
				"    top     spot  ", 
				"r  a  c e  c   a r   " ,
				"     "
				};
		
		for (String str : input) {
			Boolean b = isPalindrome(str);
			System.out.println(str + " is palindrome : " + b);
		}
	}

	private static boolean isPalindrome(String input) {
		int left = 0;
		int endIndex = input.length() -1;
		int right = endIndex;
		
		//main loop
		while (left <= right && left < input.length() && right > 0 ) {
			//skip special characters
			//System.out.println(input.length());
			while (left < endIndex && ! Character.isLetter(input.charAt(left)) ) {
				left++;
				//System.out.println(left);
			} //skip special character from right side
			while (right > 0 && ! Character.isLetter(input.charAt(right)) ) {
				right--;
			} 
			//check
			if (input.charAt(left) != input.charAt(right) ) {
				return false;
			}
			//increment to next char if false conditions not triggered
			left++;
			right--;
		}
		return true;
	}

}
