class OneAway {
	boolean oneEditAway(String s1, String s2) {
		if(s1.length() == s2.length()) {
			return oneEditReplace(s1, s2);
		}else if(s1.length() == s2.length() + 1) {
			return oneEditInsert(s1, s2);
		}else if(s1.length() == s2.length() - 1) {
			return oneEditInsert(s2, s1);
		}else {
			return false;
		}
	}

	boolean oneEditReplace(String s1, String s2) {
		boolean isDifference = false;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(isDifference) return false;
				isDifference = true;
			}
		}
		return true;
	}

	boolean oneEditInsert(String s1, String s2) {
		int indexS1 = 0;
		int indexS2 = 0;

		while(indexS1 < s1.length() && indexS2 < s2.length()) {
			if(s1.charAt(indexS1) != s2.charAt(indexS2)) {
				if(indexS1 != indexS2) {
					return false;
				}
				indexS2++;
			}else {
				indexS1++;
				indexS2++;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		OneAway result = new OneAway ();

		String s1 = "apple";
		String s2 = "appe";
		String s3 = "apppe";
		String s4 = "applee";
		String s5 = "apade";

		System.out.println("This is true and the answer is:" + result.oneEditAway(s1,s2));
		System.out.println("This is true and the answer is:" + result.oneEditAway(s1,s3));
		System.out.println("This is true and the answer is:" + result.oneEditAway(s1,s4));
		System.out.println("This is false and the answer is:" + result.oneEditAway(s1,s5));


	}
}