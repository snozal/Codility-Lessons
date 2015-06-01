
//A non-empty zero-indexed array A of N integers is given.
//The consecutive elements of array A represent consecutive cars on a road. 
//Array A contains:
//0 represents a car traveling east.
//1 represents a car traveling west.
//Return the number of pairs of passing cars.
class Solution {

	public int solution(int[] A) {

		if (A == null || A.length == 0) {
			return 0;
		}

		int total = 0;
		int numCarsEast = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				numCarsEast++;
			} else {
				total = total + numCarsEast;
				if(total > 1000000000){
					return -1;
				}
			}
		}
		
		return total;
	}
}