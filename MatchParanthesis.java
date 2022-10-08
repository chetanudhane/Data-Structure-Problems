package DataStructureProblems;

import java.util.Scanner;
import java.util.Stack;

public class MatchParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arithmetic Expression...");
		String str = sc.next();
		sc.close();

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
				System.out.println(st.toString());

			} else if (!st.empty() && ((str.charAt(i) == ']' && st.peek() == '[')
					|| (str.charAt(i) == '}' && st.peek() == '{') || (str.charAt(i) == ')' && st.peek() == '('))) {

				st.pop();
				System.out.println(st.toString());
			} else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
				st.push(str.charAt(i));

			}
		}

		if (st.empty()) {
			System.out.println("Arithmetic Expression Balanced...");
			System.out.println("Stack : " + st.toString());
		} else {
			System.out.println("Arithmetic Expression Not balanced");
			System.out.println("Stack : " + st.toString());
		}
	}
}
