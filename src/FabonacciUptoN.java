import java.util.Scanner;

public class FabonacciUptoN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = scanner.nextInt();
		int n3 = 0;
		System.out.println("Fabonacci series: ");
		while (n1 < 500) {
			System.out.print(n1);
			System.out.print("\t");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}

	}

}
