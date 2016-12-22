class ZeroMatrix2 {
	void setZeros(int[][] matrix) {
		// in this method we use the first row and the first column to store if there is zeros in the rest of the Matrix.
		// In order to do that we should first check if there are zeros in the first row and column in case the value 
		// of them are changed later
		// Then if the rest of the row or column have zeros we set the corresponding place in the first row or column 
		// to be zero


		boolean rowHasZero = false;
		boolean colHasZero = false;

		//check first row has zero;
		for(int i=0; i<matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}

		//check first column has zero;
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] ==0) {
				colHasZero = true;
				break;
			}
		}

		// check the rest of the matrix has zero 

		for(int i=1; i<matrix.length; i++) {
			for(int j=1; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// setZero based on values in row
		for(int i=0; i<matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				setColumn(matrix, i);
			}
		}

		// setZero based on values in column
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0) {
				setRow(matrix, i);
			}
		}

		// setzero based on first row boolean
		if(rowHasZero) {
			setRow(matrix, 0);
		}

		// setzero based on first column boolean 

		if(colHasZero) {
			setColumn(matrix, 0);
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