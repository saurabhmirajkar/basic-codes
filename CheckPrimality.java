import java.util.Scanner;

public class CheckPrimality {
	public static void main(String[] args) {
		
		System.out.println("Check whether a number is Prime or not :");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		
		if(number == 0 || number == 1) {
			
		}else {
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("Number "+ number + " is Prime");
			}else {
				System.out.println("Number " + number + " is NOT Prime");
			}
			
		}
		
		sc.close();
		
	}
}
