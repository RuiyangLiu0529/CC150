class RecursiveMultiply {
	int getProduct(int a, int b) {
		int bigger =  a > b ? a : b;
		int smaller = a < b ? a : b;

		return getProductHelper(smaller, bigger);
	}

	int getProductHelper(int smaller, int bigger) {
		if(smaller == 0) return 0;
		if(smaller == 1) return bigger;

		int s = smaller >> 1; // divide smaller by 2;
		int side1 = getProductHelper(s, bigger);
		int side2 = side1;

		if(smaller%2 == 1) {
			side2 = getProductHelper(smaller-s, bigger);
		}

		return side1 + side2;
	}

	public static void main(String[] args) {
		RecursiveMultiply result = new RecursiveMultiply();
		System.out.println(result.getProduct(3,6));
		System.out.println(result.getProduct(7,4));
		System.out.println(result.getProduct(1,6));
		System.out.println(result.getProduct(6,0));

	}
}