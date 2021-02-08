

public class HelloWorld {

	public static void main(String[] args) {
		//Example: Stepping through an array
		/*int[] array = {1,2,3};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/
		//Example: Compute the next step in an approximation
		//until you get close enough
		int[] array = {1,2,3};
		int i = 0;
		while(array[i] != 3) {
			i++;
		}
		System.out.println(array[i]);
		
		/*int sum = 0;
		//int number = 1;
		for(int number = 1; number <=100; number++) {
			sum += number;
		}
		System.out.println(sum);*/
		
		/*while(number <= 100) {
			sum =+ number;
			number++;
			if(number == 67) {
				System.out.println(number);
			}
		}
		*/
		
		/*double distance;
		String firstName;
		int count = 0;
		distance = 4.67;
		double pi = 3.1415;
		char ch = 'a';
		String name = "Superman";
		
		System.out.println("HHHello World!"
		+distance
		+pi
		+ch
		+name
		+count);
		
		if(distance > 5) {
			System.out.println("distance is greater then 5");
			if(distance < 10) {
				System.out.println("distance is also less then 10");
		}}else {
			System.out.println("distance is less then 5");
		}*/
		
	}		
}
