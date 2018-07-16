import java.util.Scanner;

class Numbers{
	int numberOne, numberTwo, numberThree;
}

public class GreatestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Numbers obj = new Numbers();
		
		System.out.println("Enter three numbers : (Hit enter after each input)");
		
		obj.numberOne = sc.nextInt();
		obj.numberTwo = sc.nextInt();
		obj.numberThree = sc.nextInt();

		int numb1 = obj.numberOne;
		int numb2 = obj.numberTwo;
		int numb3 = obj.numberThree;
		
		
		if((numb1 >= numb2) && (numb2 >= numb3) && (numb1 >= numb3)) {
			System.out.println("Greatest number is " + numb1);
		}else if((numb1 <= numb2) && (numb2 >= numb3) && (numb1 >= numb3)) {
			System.out.println("Greatest number is " + numb2);
		}else {
			System.out.println("Greatest number is " + numb3);
		}
		sc.close();
	}

}
