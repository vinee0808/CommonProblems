import java.util.Scanner;

public class PrintPalindromeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the upper boundary: ");
		int n = scanner.nextInt();
		//int rev = 0;
		int a, num = 0;
		System.out.println("Palindrome numbers: ");
		for (int i = 0; i <= n; i++) {
			int rev = 0;
			num = i;
			while (num > 0) {
				a = num % 10;
				rev = rev * 10 + a;
				num = num / 10;
			}
			if(i==rev) {
				System.out.println(i+" ");
			}
			//rev = 0;
		}
		
	}

}
