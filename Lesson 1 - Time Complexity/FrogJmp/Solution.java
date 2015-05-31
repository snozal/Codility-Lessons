//Count minimal number of jumps from position X to Y. The frog always jumps a fixed distance D.

class Solution {

	public int solution(int X, int Y, int D) {

		int solution = (Y - X) / D;

		if ((Y - X) % D != 0) {

			solution++;
		}

		return solution;
	}
}
