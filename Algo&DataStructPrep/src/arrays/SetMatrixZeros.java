package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {

	public static void main(String[] args) {
		/*Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

		Follow up:

		A straight forward solution using O(mn) space is probably a bad idea.
		A simple improvement uses O(m + n) space, but still not the best solution.
		Could you devise a constant space solution?
		 

		Example 1:


		Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
		Output: [[1,0,1],[0,0,0],[1,0,1]]
		Example 2:


		Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
		Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
		 

		Constraints:

		m == matrix.length
		n == matrix[0].length
		1 <= m, n <= 200
		-231 <= matrix[i][j] <= 231 - 1*/
		
		int matrix[][] = new int[][] {{1,1,1},{1,0,1},{1,1,1}};//[[1,0,1],[0,0,0],[1,0,1]]
		ArrayList <Integer> x = new ArrayList <Integer> ();
		ArrayList <Integer> y = new ArrayList <Integer> ();
		
		for(int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					//store i that is zero
					x.add(i);
					//store j that is zero
					y.add(j);
				}
			}
		
		int j = 0;
		for(int i = 0; i < matrix.length; i++) {
			//if i in x matrix[i][j] = 0
			for(int k = 0; k < x.size(); k++) {
				if(x.get(k).equals(i)) {
					matrix[i][j] = 0;
					break;
				}
			}
			for(j = 0; j < matrix[0].length; j++) {
				//if j in y matrix[i][j] = 0
				for(int l = 0; l < y.size(); l++) {
					if(x.get(k).equals(i)) {
						matrix[i][j] = 0;
						break;
					}
				}
			}
		}
		
		
		for(int[] array : matrix) System.out.println(Arrays.toString(array));

	}

}
