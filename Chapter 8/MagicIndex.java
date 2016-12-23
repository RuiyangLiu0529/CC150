class MagicIndex {
	int magic(int[] array) {
		return magicHelper(array, 0, array.length - 1);
	}	

	int magicHelper(int[] array, int start, int end) {
		if(end < start) return -1;
		int mid = (start + end)/2;

		if(array[mid] == mid) {
			return mid;
		}else if(array[mid] > mid) {
			return magicHelper(array, start, mid-1); //这里有时候如果需要保留mid的话可能会造成死循环 注意下跳出条件 比如start＝0 end＝1 mid＝0；
		}else {
			return magicHelper(array, mid+1, end);
		}

	}

	public static void main(String[] args) {
		int[] array = new int[11];
		array[0] = -40;
		array[1] = -20;
		array[2] = -1;
		array[3] = 1;
		array[4] = 2;
		array[5] = 3;
		array[6] = 5;
		array[7] = 7;
		array[8] = 9;
		array[9] = 12;
		array[10] = 13;

		MagicIndex result = new MagicIndex();
		System.out.println(result.magic(array));

	}
 }