import java.util.Scanner;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println("Prime Number between 1 and " + n);
		
		
		for (int i = 1; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime == true) {

				System.out.print(i);
				System.out.print('\t');
			}
		}

	}

}
