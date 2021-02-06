package prime;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//Enter a number and print a message if it is prime or not
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int myNumber = scanner.nextInt();
		
		// Brute force implementation
		/*int multiple = 2;
		while(multiple != myNumber) {
			
			if(myNumber%multiple == 0) {
				System.out.println("Number is not prime");
				System.exit(0);
			}
			multiple++;
		}
		System.out.println("Number is a prime");
		scanner.close();*/
		
		// More optimized implementation
		// The issue is other multiples are not skipped in this check
		// For instance when we check for 2 we know 4,6,8.. are not multiples too
		
	
	}

}
