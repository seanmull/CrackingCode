package arraysAndStrings;

public class MajorityElement {

	public static void main(String[] args) {
		/*Given an array nums of size n, return the majority element.

		The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

		Example 1:

		Input: nums = [3,2,3]
		Output: 3
		
		Example 2:

		Input: nums = [2,2,1,1,1,2,2]
		Output: 2
				
		Constraints:

		n == nums.length
		1 <= n <= 5 * 104
		-2^31 <= nums[i] <= 2^31 - 1
				 
		Follow-up: Could you solve the problem in linear time and in O(1) space?*/
		int nums[] = new int[] {2,2,1,1,1,2,2};
		//First do the brute force solution
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length - 1; j++) {
				if(nums[i] == nums[j]) count++;
				if(count > nums.length/2) {
					System.out.println(nums[i]);
					break;
				}
			}
		}
		//Do one loop to track the nums position
			//Do another loop to track the comparision position
				//If match increment count
				//If count greater then n/2
					//Print current number and break
		
		
		//Then try the follow-up


	}

}
