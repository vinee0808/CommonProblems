import java.util.Scanner;

public class CheckForFibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNo = scanner.nextInt();
		System.out.println("Enter second number: ");
		int secondNo = scanner.nextInt();
		//System.out.println("Enter third number: ");
		//int thirdNo = scanner.nextInt();
		int thirdNo = 0;
		System.out.println("Enter an input number: ");
		int inputNo = scanner.nextInt();
		while (thirdNo < inputNo) {
			thirdNo = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = thirdNo;
		}
		if (thirdNo == inputNo) {
			System.out.println("Number belongs to Fibonacci series");
		} else {
			System.out.println("Number does not belong to Fibonacci series");
		}
	}

}
