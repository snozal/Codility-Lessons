 import java.util.*;

//Write a function that, given a non-empty zero-indexed array A, returns the value of the maximal product of any triplet.
    class Solution {

        public int solution(int[] A) {

			if (A == null || A.length < 3) {
				return 0;
			} else if (A.length == 3) {
				return A[0] * A[1] * A[2];
			}

			Arrays.sort(A);

			return Math.max(A[A.length - 1] * A[A.length - 2] * A[A.length - 3], A[A.length - 1] * A[0] * A[1]);
        }
    }