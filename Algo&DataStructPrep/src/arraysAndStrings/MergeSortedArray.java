package arraysAndStrings;

public class MergeSortedArray {

	public static void main(String[] args) {
		/*Given two sorted integer arrays nums1 and nums2, 
		 * merge nums2 into nums1 as one sorted array.

		The number of elements initialized in nums1 and nums2 are m and n respectively.
		 You may assume that nums1 has a size equal to m + n such that it has enough 
		 space to hold additional elements from nums2.

		Example 1:

		Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		Output: [1,2,2,3,5,6]
		Example 2:

		Input: nums1 = [1], m = 1, nums2 = [], n = 0
		Output: [1]
		
		//First create non-zeroed arrays
		//Create larger empty array based on total size of both
		//Initialize position of both arrays
		//Loop through this larger array
			//if num1 is larger
				//pull num2
				//increment its index
			//if num2 is larger
				//pull num1
				//increment it index
		 

		Constraints:

		nums1.length == m + n
		nums2.length == n
		0 <= m, n <= 200
		1 <= m + n <= 200
		-109 <= nums1[i], nums2[i] <= 109*/

	}

}
