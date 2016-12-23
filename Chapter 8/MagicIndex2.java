class MagicIndex2 {
	int magic(int[] array) {
		return magicHelper(array, 0, array.length-1);
	}

	int magicHelper(int[] array, int start, int end) {
		if(end < start) return -1;

		int mid = (start + end)/2;

		if(array[mid] == mid) {
			return mid;
		}

		int leftIndex = Math.min(mid-1, array[mid]);
		int left = magicHelper(array, start, leftIndex);
		if(left > 0) {
			return left;
		}

		int rightIndex = Math.max(mid+1, array[mid]);
		int right = magicHelper(array, rightIndex, end);

		return right;
	}


	public static void main(String[] args) {
		int[] array = new int[11];
		array[0] = -10;
		array[1] = -5;
		array[2] = 2;
		array[3] = 2;
		array[4] = 2;
		array[5] = 3;
		array[6] = 4;
		array[7] = 7;
		array[8] = 9;
		array[9] = 12;
		array[10] = 13;

		MagicIndex2 result = new MagicIndex2();
		System.out.println(result.magic(array));

	}
}