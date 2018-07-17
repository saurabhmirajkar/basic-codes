import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter number of terms : ");
		Scanner sc = new Scanner(System.in);
		int terms = sc.nextInt();
		int firstTerm = 0, secondTerm = 1, result = 0;
		System.out.print(firstTerm + " " + secondTerm);
		
		while((terms-2) > 0) {
			result = firstTerm + secondTerm;
			System.out.print(" " + result);
			firstTerm = secondTerm;
			secondTerm = result;
			terms--;
		}
		sc.close();
	}
}
