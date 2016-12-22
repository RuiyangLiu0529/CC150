class StringCompression {
	String compress(String s) {
		if(s.length() == 1) return s;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = 1;
		int count = 1;
		while(j < s.length()) {
			if(s.charAt(i) == s.charAt(j)) {
				count++;
			}else {
				sb.append(s.charAt(i));
				sb.append(String.valueOf(count));
				i = j;
				count = 1;
			}
			j++;
		}

		sb.append(s.charAt(i));
		sb.append(String.valueOf(count));

		return sb.length() < s.length() ? sb.toString() : s;
	}

	public static void main(String[] args) {
		StringCompression result = new StringCompression();

		System.out.println("aaabbcccdd is a3b2c3d2" + " " + result.compress("aaabbcccdd"));
		System.out.println("abc is abc" + " " + result.compress("abc"));
		System.out.println("aabbcc is aabbcc" + " " + result.compress("aabbcc"));	
	

	}
}