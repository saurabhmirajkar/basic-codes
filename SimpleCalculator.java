import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Simple Calculator");
		System.out.println("Enter two numbers :");
		double numberOne = sc.nextDouble();
		double numberTwo = sc.nextDouble();
		
		System.out.println("Enter type of operator : ");
		String operator = sc.next();
		
		switch (operator) {
		case "+":
			System.out.println("Result : " + (numberOne + numberTwo));
			break;
			
		case "-":
			System.out.println("Result : " + (numberOne - numberTwo));
			break;
			
		case "*":
			System.out.println("Result : " + (numberOne * numberTwo));
			break;
			
		case "/":
			System.out.println("Result : " + (numberOne / numberTwo));
			break;

		default:
			break;
		}
		
		sc.close();
	}
}
