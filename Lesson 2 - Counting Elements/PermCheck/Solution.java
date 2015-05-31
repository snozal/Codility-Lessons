import java.util.Arrays;

//Check whether array A is a permutation 
//A permutation is a sequence containing each element from 1 to N once, and only once.
class Solution {

	public int solution(int[] A) {

		if (A == null || A.length == 0) {
			return 0;
		}

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return 0;
			}
		}
		return 1;
	}
}