class ZeroMatrix {
	void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for(int i=0; i<matrix.length; i++) {
			if(row[i]) {
				setRow(matrix, i);
			}
		}

		for(int i=0; i<matrix[0].length; i++) {
			if(column[i]) {
				setColumn(matrix, i);
			}
		}
	}

	void setRow(int[][] matrix, int rowIndex) {
		for(int i=0; i<matrix[0].length; i++) {
			matrix[rowIndex][i] = 0;
		}
	} 

	void setColumn(int[][] matrix, int columnIndex) {
		for(int i=0; i<matrix.length; i++) {
			matrix[i][columnIndex] = 0;
		}
	}


	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = 1;
			}
		}

		matrix[2][4] = 0;
		matrix[1][3] = 0;

		ZeroMatrix result = new ZeroMatrix();
		result.setZeros(matrix);

		for (int i=0; i<matrix.length; i++ ) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
}