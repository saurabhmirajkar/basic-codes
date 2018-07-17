import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int number = sc.nextInt();							// number = 153
		String numberInString = Integer.toString(number);
		
		int numberOfDigits = numberInString.length();
		System.out.println("Count = " + numberOfDigits);					// numberOfDigits = 3
		
		int tempNumber = number;
		int sum = 0;
		int holder = 0;
		int poweredNumber;
		
		while(number > 0) {
			holder = number % 10; 							// holder = 3 -> holder = 5 -> holder = 1
			number = number / 10;							// number = 15 -> number = 1 -> number = 0
			poweredNumber = (int) Math.pow(holder, numberOfDigits);
			sum += poweredNumber;				// sum = 0 + 27 -> sum = 27 + 125 -> sum = 152 + 1
		}
		
		if(tempNumber == sum) {
			System.out.println(tempNumber + " is an Armstrong Number");
		}else {
			System.out.println(tempNumber + " is NOT an Armstrong Number");
		}
		
		sc.close();
	}
}
