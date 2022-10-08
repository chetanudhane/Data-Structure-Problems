package DataStructureProblems;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		checkPalindrome();
	}

	public static void checkPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String To Check...");
		String str = sc.next();
		int length = str.length();
		int maxloop = length / 2;
		int count1 = 0;
		int count2 = length - 1;
		boolean isPalindrome = true;
		for (int i = 0; i < maxloop; i++) {
			if (str.charAt(count1) != str.charAt(count2)) {
				isPalindrome = false;
			}
			count1++;
			count2--;
		}
		if (isPalindrome) {
			System.out.println("String " + str + " Is Palindrom");
		} else {
			System.out.println("String " + str + " Is Not Palindrome");
		}
		sc.close();
	}
}
