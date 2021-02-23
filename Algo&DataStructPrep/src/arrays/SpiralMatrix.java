package arrays;

import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		/*Given an m x n matrix, return all elements of the matrix in spiral order.

		Example 1:


		Input: matrix = 
		[[1,2,3],
		[4,5,6],
		[7,8,9]]
		Output: [1,2,3,6,9,8,7,4,5]
		Example 2:
		Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
		Output: [1,2,3,4,8,12,11,10,9,5,6,7]
				 
		Constraints:

		m == matrix.length
		n == matrix[i].length
		1 <= m, n <= 10
		-100 <= matrix[i][j] <= 100*/
		
		int matrix[][] = new int[][] {{1,2},{3,4}};
		//int matrix[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};//[1,2,3,6,9,8,7,4,5]
		//int matrix[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//[1,2,3,4,8,12,11,10,9,5,6,7]
        
		//if one row/column left, no circle can be formed
		
		//below, process a circle
		//top - move right
		//right - move down
		//bottom - move left
		//left - move up
		
		//increment start position when you go to the next layer
		//decrement rows and columns by two one for each side
		//System.out.println(Arrays.toString(spiralMatrix));
		
		

	}

}
