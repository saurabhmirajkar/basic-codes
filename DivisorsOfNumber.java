import java.util.Scanner;

class Number{
	int numb;
}

public class DivisorsOfNumber {
	public static void main(String[] args) {
		
		System.out.println("Divisor of a number :");
		
		Number obj = new Number();	
		Scanner sc = new Scanner(System.in);
		obj.numb = sc.nextInt();
		
		int number = obj.numb;
		for (int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + "\t");
			}
		}
		sc.close();
	}
}
