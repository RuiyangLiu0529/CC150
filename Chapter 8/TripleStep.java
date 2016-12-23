class TripleStep {
	// just try the memoization solution
	int countWays(int n) {
		int[] memo = new int[n+1];
		return countWaysHelper(n, memo);
	}

	int countWaysHelper(int i, int[] memo) {
		if(i<=3) return 1;
		if(memo[i] == 0) {
			memo[i] = countWaysHelper(i-1, memo) + countWaysHelper(i-2, memo) + countWaysHelper(i-3, memo);
		}
		return memo[i];
	}

	public static void main(String[] args) {
		TripleStep result = new TripleStep();
		System.out.println(result.countWays(5) + "the right answer is 5");
	}
}