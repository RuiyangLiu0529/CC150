 class PalindromePermutaion3 {
 	boolean isPermutationOfPalindrome(String s) {
 		int bitVector = createVector(s);
 		return bitVector == 0 || checkOnlyOneBitSet(bitVector);
 	}

 	int createVector(String s) {
 		s = s.toLowerCase();
 		int bitVector = 0;
 		for(int i=0; i<s.length(); i++) {
 			char c = s.charAt(i);
 			if(c>='a' && c<= 'z') {
 				int value = c - 'a';
 				bitVector = toggle(bitVector,value);
 			}
 		}
 		return bitVector;
 	}
 	int toggle(int bitVector, int value) {
 		int mask = 1<<value;
 		if((bitVector & mask) == 0) {
 			bitVector |= mask;
 		}else {
 			bitVector &= ~mask;
 		}
 		return bitVector;
 	}

 	boolean checkOnlyOneBitSet(int bitVector) {
 		return (bitVector&(bitVector-1)) == 0;
 	}

 	public static void main(String[] args) {
		PalindromePermutaion3 result = new PalindromePermutaion3();
		String s1 = "acddccca";
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