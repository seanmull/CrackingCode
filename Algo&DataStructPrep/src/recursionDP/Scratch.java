package recursionDP;

public class Scratch {

	public static void main(String[] args) {
		System.out.println(fib(3));

	}
	
	/*public static int addSums(int i) {
		if(i == 1) {
			System.out.println(i + " " + i);
			return i;
		}
		int sum = i + addSums(i - 1); //3 + addSums(2), 2 + addSums(1), returns 1
		System.out.println(i + " " + sum); //2 2 + 1 = 3, 3 3 + 3 = 6
		return sum; //6 or 3 + addSums(2)

	}*/
	
	//      i       |       sum
	//      3             3 + addSums(2)
	//      2             2 + addSums(1)
	//      1                1
	
	
	//              i      sum
	//              3    3+(2+1)
	//              2     2+(1)
	//              1      1
	
	//      pass current i + plus previous i's
	
	public static int fib(int i) {
	if(i == 1 || i == 0) {
		System.out.println(i + " " + i);
		return i;
	}
	int sum = 0;
	for(int j = 1; j < 3; j++) {
		//System.out.println(i + " " + j);
		sum += fib(i-j);
	}
	//int sum = fib(i- 1) + fib(i - 2); //3 + addSums(2), 2 + addSums(1), returns 1
	System.out.println(i + " " + (i-1) + " " + (i-2) + " " + sum); //2 2 + 1 = 3, 3 3 + 3 = 6
	return sum; //6 or 3 + addSums(2)
	}
	
	//      i       |       sum
	//      3              fib(3)       2
	//      2         fib(2) + fib(1)   1 + 1 = 2
	//      1         fib(1) + fib(0)   1 + 0 = 1      
	
	
	
	//             3
	//       2           1
	//   1      0     

}
