package recursionDP;

public class CanSum {

	public static void main(String[] args) {
		int[] num = new int[] {7,4};
		System.out.println(CanSums(500, num));

	}
	
	public static boolean CanSums(int targetValue, int[] numbers) {
		if(targetValue == 0) return true;
		if(targetValue < 0) return false;
		for(int num : numbers) {
			System.out.println(targetValue + " " + (targetValue - num));
			if(CanSums(targetValue - num, numbers) == true) {
				return true; 
			}	
		}
		return false;

	}

}
