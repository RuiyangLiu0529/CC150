class PalindromePermutaion2 {
	boolean isPermutationOfPalindrome(String s) {
		s = s.toLowerCase();
		int countOdd = 0;
		int[] table = new int[26];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z') {
				table[c]++;
				if(table[c]%2 == 1) {
					countOdd++;
				}else {
					countOdd--;
				}
			}
		}
		return countOdd<=1 ;
	}
	public static void main(String[] args) {
		PalindromePermutaion2 result = new PalindromePermutaion2();
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