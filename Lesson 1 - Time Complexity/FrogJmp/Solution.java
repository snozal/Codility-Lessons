class Solution {

	public int solution(int X, int Y, int D) {

		int solution = (Y - X) / D;

		if ((Y - X) % D != 0) {

			solution++;
		}

		return solution;
	}
}