import java.util.Stack;

//Write a function that, given a string S consisting of N characters, 
//returns 1 if string S is properly nested and 0 otherwise. This includes ().

class Solution {
	public static int solution(String S) {

		if (S == null || S.length() == 1) {
			return 0;
		} else if(S.isEmpty()) {
			return 1;
		}

		// I think a good solution is to use a Stack
		Stack<Character> stack = new Stack<Character>();
		char[] input = S.toCharArray();

		for (int i = 0; i < input.length; i++) {
			if (')' == input[i]) {
				if (stack.isEmpty() || ')' == stack.pop()) {
					return 0;
				}
			} else {
				stack.push(input[i]);
			}
		}

		if (stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
}