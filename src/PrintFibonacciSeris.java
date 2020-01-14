import java.util.Scanner;

public class PrintFibonacciSeris {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = scanner.nextInt();
		System.out.println("Enter the number of count: ");
		int count = scanner.nextInt();
		int n3 = 0;
		System.out.println("Fabonacci series: ");
		System.out.print(n1);
		System.out.print("\t");
		System.out.print(n2);
		System.out.print("\t");
		for (int i = 3; i <= count; i++) {
			n3 = n1 + n2;
			System.out.print(n3);
			System.out.print("\t");
			n1 = n2;
			n2 = n3;

		}

	}

}
