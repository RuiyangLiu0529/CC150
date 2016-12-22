class PalindromePermutaion {
	boolean isPermutationOfPalindrome(String s) {
		int[] table = buildCharFrequency(s);
		return checkMaxOneOdd(table);
	}

	boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for(int count : table) {
			if(count%2 == 1) {
				if(foundOdd) return false;
				foundOdd = true;
			}
		}
		return true;
	}

	int[] buildCharFrequency(String s) {
		s = s.toLowerCase();
		int[] table = new int[26];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int index = getCharNumber(c);
			if(index != -1) {
				table[index]++;
			}
		}
		return table;
		
	}

	int getCharNumber(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);

		if(val - a >=0 && z - val >=0) {
			return val-a;
		}
		return -1;
	}

	public static void main(String[] args) {
		PalindromePermutaion result = new PalindromePermutaion();
		String s1 = "abcddccca";
		System.out.println("True");
		System.out.println(result.isPermutationOfPalindrome(s1));

		String s2 = "aBcdDccCa";
		System.out.println("True");
		System.out.println(result.isPermutationOfPalindrome(s2));

		String s3= "a Bcd ccCa D"; 
		System.out.println("True");
		System.out.println(result.isPermutationOfPalindrome(s3));

		String s4 = "aadcdacjcc";
		System.out.println("False");
		System.out.println(result.isPermutationOfPalindrome(s4));

	}
}