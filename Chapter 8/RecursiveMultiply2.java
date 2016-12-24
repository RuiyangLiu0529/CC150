class RecursiveMultiply2 {
	int getProduct(int a, int b) {
		int bigger =  a > b ? a : b;
		int smaller = a < b ? a : b;
		int[] memo = new int[smaller+1];

		return getProductHelper(smaller, bigger, memo);
	}

	int getProductHelper(int smaller, int bigger, int[] memo) {
		if(smaller == 0) return 0;
		if(smaller == 1) return bigger;
		if(memo[smaller] != 0) return memo[smaller];

		int s = smaller>>1;
		int side1 =  getProductHelper(s, bigger, memo);
		int side2 = side1;
		if(smaller%2 == 1) {
			side2 = getProductHelper(smaller-s, bigger, memo);
		}
		memo[smaller] = side1+side2;
		return memo[smaller];
	}

	public static void main(String[] args) {
		RecursiveMultiply result = new RecursiveMultiply();
		System.out.println(result.getProduct(3,6));
		System.out.println(result.getProduct(7,4));
		System.out.println(result.getProduct(1,6));
		System.out.println(result.getProduct(6,0));

	}
}