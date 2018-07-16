import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Check prime number");
//		int number = sc.nextInt();
		
		System.out.println("Prime Numbers between 200 and 500 :");
		System.out.println();
		for (int number = 200; number <= 500; number++) {
			boolean isPrime = true;	
			
			if(number == 0 || number == 1) {
//				System.out.println("Number is either 0 or 1");
			} else {
				
				for(int denominator = 2; denominator < number; denominator++) {
//					System.out.println("You are in for loop");
					if(number % denominator == 0) {
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					System.out.println(number);
				}
//				else {
//					System.out.println("Number "+ number + " is composite");
//				}
			}
		}
		sc.close();
	}
}
