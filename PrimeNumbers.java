
public class PrimeNumbers {
	public static void main(String[] args) {
		
		System.out.println("Prime numbers from 200 to 500 are as follows :");
		System.out.println();
		
		for (int number = 200; number <= 500; number++) {
			boolean isPrime = true;
			if(number == 0 || number == 1) {
				System.out.println();
			}else {
				for (int denominator = 2; denominator < number; denominator++) {
					if(number % denominator == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(number);
				}
			}
		}
		
	}
}
