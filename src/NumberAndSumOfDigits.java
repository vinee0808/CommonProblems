import java.util.Scanner;

public class NumberAndSumOfDigits {
	public static void main(String[] args) {
		int count=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num= scanner.nextInt();
		int sum=0;
		while(num!=0) {
			int num1=num%10;
			num=num/10;
			count= count+1;
			sum= sum+num1;
		}
		System.out.println("Number of digit in number = "+ count);
		System.out.println("Sum of the digits: " + sum);
	}

}
