import java.util.Scanner;

public class NumberOfLearYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lower bound: ");
		int a = scanner.nextInt();
		System.out.println("Enter the upper bound: ");
		int b = scanner.nextInt();
		System.out.println("Leap Years Between " + a + " and " + b);
		boolean isLeap = true;
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (i % 4 == 0) {
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						isLeap = true;
					} else {
						isLeap = false;
					}
				} else {
					isLeap = true;
				}
			} else {
				isLeap = false;
			}
			if (isLeap == true) {
				System.out.println(i);
				count = count + 1;
			}
		}
		System.out.println("Number of leap years between " + a + " and " + b + " : " + count);

	}

}
