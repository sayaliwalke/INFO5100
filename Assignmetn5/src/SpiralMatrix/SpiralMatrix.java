package SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int n = matrix.length;
		int maxrow = n - 1;
		int maxcol = n - 1;
		int minrow = 0;
		int mincol = 0;
		while (maxrow >= minrow && maxcol >= mincol) {
			for (int i = mincol; i <= maxcol; i++) {
				arrayList.add(matrix[minrow][i]);
			}
			minrow++;
			for (int i = minrow; i <= maxrow; i++) {
				arrayList.add(matrix[i][maxcol]);
			}
			maxcol--;
			for (int i = maxcol; i >= mincol; i--) {
				arrayList.add(matrix[maxrow][i]);
			}
			maxrow--;
			for (int i = maxrow; i >= minrow; i--) {
				arrayList.add(matrix[i][mincol]);
			}
			mincol++;
		}

		System.out.println("The spiral array formed by matrix is: \n" + arrayList);
		return arrayList;

	}

	public static void main(String[] args) {

		SpiralMatrix spiral = new SpiralMatrix();
		int matrix[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
		spiral.spiralOrder(matrix);
	}

}
