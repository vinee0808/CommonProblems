import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int n = scanner.nextInt();
		boolean isLeap = true;
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			}else {
				isLeap=true;
			}
		} else {
			isLeap = false;
		}
		if (isLeap == true) {
			System.out.println(n + " is a leap year");
		} else {
			System.out.println(n + " is not a leap year");
		}

	}
}
