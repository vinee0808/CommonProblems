import java.util.Scanner;

public class PrintDigitsOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		int count=0;
		System.out.println("Digits of the number: " + num);
		while (num != 0) {
			int num1 = num % 10;
			num = num / 10;
			count=count+1;
			System.out.println("Digit at place "+count+" is: "+num1);
		}
	}

}
