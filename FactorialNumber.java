import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		// Using normal method
		int multiple = 1;
		for (int i = number; i > 0; i--) {
			multiple *= i;
		}
		System.out.println("Factorial of " + number + " : " + multiple);
		
		
		// Using recursive function
		System.out.println();
		System.out.println("Using Recursion");
		int factorial = getFactorialOfNumber(number);
		System.out.println("Factorial of "+ number +" is "+ factorial);
		
		
		
		sc.close();
	}

	private static int getFactorialOfNumber(int number) {
		if(number > 1) {
			return number * getFactorialOfNumber(number - 1);
		}
		else {
			return 1;
		}
		
	}
}
