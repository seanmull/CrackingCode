package prime;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//enter number
		
		//loop through the possible multiples of number
		//compare multiple with number
		//stop if it is a multiple, print not prime
		//continue with loop
		
		//print prime
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int myNumber = scanner.nextInt();
		//System.out.print(myNumber);
		
		int multiple = 2;
		while(multiple != myNumber) {
			
			if(myNumber%multiple == 0) {
				System.out.println("Number is not prime");
				System.exit(0);
			}
			multiple++;
		}
		System.out.println("Number is a prime");
		scanner.close();
	}

}
