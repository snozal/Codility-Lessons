import java.util.HashSet;
import java.util.Set;

/*Find the earliest time when a frog can jump to the other side of a river.
 
A small frog wants to get to the other side of a river. The frog is currently located at position 0, and wants to get to position X. Leaves fall from a tree onto the surface of the river.

You are given a non-empty zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X. You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

If the frog is never able to jump to the other side of the river, the function should return -1.*/
class Solution {

	public int solution(int X, int[] A) {

		if (A == null || A.length == 0) {
			return -1;
		}

		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] <= X){
				set.add(A[i]);
				if(set.size() == X){
					return i;
				}
			}
		}
		return -1;
	}
}