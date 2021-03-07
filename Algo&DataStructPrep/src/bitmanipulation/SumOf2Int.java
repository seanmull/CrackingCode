package bitmanipulation;

public class SumOf2Int {

	public static void main(String[] args) {
		/*Given two integers a and b, return the sum of the two integers without using the operators + and -.

				 

				Example 1:

				Input: a = 1, b = 2
				Output: 3
				Example 2:

				Input: a = 2, b = 3
				Output: 5
				 

				Constraints:

				-1000 <= a, b <= 1000*/
		
				// 1 01  2 10 3 11
		
				//11 ^ 1 = 10
		
				/*int a = -56; //10
				int b = 2; //10
				int c = 0;
				boolean carryOver = false;
				int i = 0;
				
				
				while(i != 32) {
					//Case 1 both are 1
					if((int)(a & (1 << i)) == (1 << i) && (int) (b & (1 << i)) == (1 << i)) {
						if(!carryOver) {
							carryOver = true;
						}else {
							c ^= (1 << i);
						}
					}
					
					//Case 2 one or the other is 1
					if(((int)(a & (1 << i)) == (1 << i) && (int) (~b & (1 << i)) == (1 << i)) ||
					   ((int)(~a & (1 << i)) == (1 << i) && (int) (b & (1 << i)) == (1 << i))) {
						 if(!carryOver) c ^= (1 << i);
					}
					
					//Case 3 both are 0
					if(((int)(~a & (1 << i)) == (1 << i) && (int) (~b & (1 << i)) == (1 << i))) {
						 if(carryOver) {
							 c ^= (1 << i);
							 carryOver = false;
						 }
					}
					i++;
				}
				
				
				System.out.println(c);
				System.out.println(carryOver);*/
		
				int a = 2;
				int b = -3;
				
				while(a > 0) {
					a--;
					b++;
				}
				while(a < 0) {
					b--;
					a++;
				}
				//System.out.println(b);
				
			
				
				
		

				

		

	}

}
