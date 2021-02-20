package arrays;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

		You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
		DO NOT allocate another 2D matrix and do the rotation.

		Example 1:


		Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
		Output: [[7,4,1],[8,5,2],[9,6,3]]
		Example 2:


		Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
		Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
		Example 3:

		Input: matrix = [[1]]
		Output: [[1]]
		Example 4:

		Input: matrix = [[1,2],[3,4]]
		Output: [[3,1],[4,2]]
		 

		Constraints:

		matrix.length == n
		matrix[i].length == n
		1 <= n <= 20
		-1000 <= matrix[i][j] <= 1000*/
		
		int matrix[][] = new int[][] {{1,2},{3,4}};
		int storeNum = matrix[0][0];
		
		for(int row = 0; row < matrix.length; row++)
			storeNum = matrix[0][0];//Store one element
			for(int column = 0; column < matrix.length; column++) {
				
				matrix[0][1] = storeNum;//Move the top side
				
				matrix[1][1] = matrix[0][1];//Move the right side
				//Move the bottom
				matrix[0][0] = matrix[1][0];//Move the left side				
			}
			
		System.out.println(Arrays.toString(matrix[0]));
		
		//System.out.println(Arrays.toString(matrix[0]));
				
		//Loop through the n/2 layers
			//Loop through the elements from 0 to n in the layer
				
				


	}

}
