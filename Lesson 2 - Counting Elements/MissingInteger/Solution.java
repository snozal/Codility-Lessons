import java.util.Arrays;

//Write a function that, given a non-empty zero-indexed array A of N integers,
//returns the minimal positive integer (greater than 0) that does not occur in A.
class Solution {
	
	public int solution(int[] A) {

		if (A == null || A.length == 0) {
			return 1;
		}

		Arrays.sort(A);

		boolean first = true;
		for (int i = 0; i < A.length; i++) {

			// Check first positive integer is 1
			if (A[i] > 0) {
				if (first && A[i] != 1) {
					return 1;
				} else {
					first = false;
				}

				if (A[i] == A[i + 1] || A[i] + 1 == A[i + 1]) {
					continue;
				} else {
					return A[i] + 1;
				}
			}
		}

		if (first) {
			return 1;
		} else {
			return A[A.length - 1] + 1;
		}
	}
}
