//Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
class Solution {

	public static int solution(int[] A) {

		if (A.length == 0 || A.length == 1) {
			return 0;
		}

		// Initialization
		int sumLeft = A[0];
		int sumRight = 0;
		for (int i = 1; i < A.length; i++) {
			sumRight += A[i];
		}

		int dif = Math.abs(sumLeft - sumRight);

		for (int j = 1; j < A.length - 1; j++) {
			sumLeft += A[j];
			sumRight -= A[j];

			if (Math.abs(sumLeft - sumRight) < dif) {
				dif = Math.abs(sumLeft - sumRight);
			}
		}
		return dif;
	}
}