class RotateMatrix {
	void rotate(int[][] matrix) {
		if(matrix.length == 0 || matrix.length != matrix[0].length) return;
		int n = matrix.length;

		for(int layer=0; layer<n/2; layer++) {
			int first = layer;
			int last = n - layer - 1;
			for(int i=first; i<last; i++) {
				int offset = i-first;
				// store top
				int temp = matrix[first][i];
				// left - > top
				matrix[first][i] = matrix[last-offset][first];
				// bottom - > left
				matrix[last-offset][first] = matrix[last][last-offset];
				// right -> bottom 
				matrix[last][last-offset] = matrix[i][last];
				// top - > right
				matrix[i][last] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int num = 0;
		for(int i=0; i< 3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = num;
				num++;
			}
		}

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix[i][j]);
			}
		}

		RotateMatrix result = new RotateMatrix();
		result.rotate(matrix);

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix[i][j]);
			}
		}

	}
}