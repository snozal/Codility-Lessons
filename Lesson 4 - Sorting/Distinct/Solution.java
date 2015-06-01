 import java.util.*;

 //Compute number of distinct values in an array.
    class Solution {

        public int solution(int[] A) {

            if (A == null || A.length == 0) {
                return 0;
            }

            Set<Integer> set = new HashSet<Integer>();

            for (int i = 0; i < A.length; i++) {
                set.add(A[i]);
            }

            return set.size();
        }
    }