import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int num= scanner.nextInt();
		
		int firstDigit= num%10;
		int remainingNo= num/10;
		int secondDigit= remainingNo%10;
		remainingNo= remainingNo/10;
		int thirdDigit= remainingNo%10;
		
		int sum= firstDigit+ secondDigit+thirdDigit;
		System.out.println("The sum of digits of number "+num+ " = "+ sum);

		
	}
}
