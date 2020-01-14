import java.util.Scanner;

public class StringIntegerArray {
	public static void main(String[] args) {
		// String[] arr = { "str12n", "vinee0808", "sa71dh" };
		int sum = 0;
		;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of elements in an array: ");
		int noOfElements = scanner.nextInt();
		String[] arr = new String[noOfElements];
		System.out.println("Enter elements of the array: ");
		for (int k = 0; k < noOfElements; k++) {
			arr[k] = scanner.next();
		}
		System.out.println("Enter the index of array to get sum of digits in that string: ");
		int n = scanner.nextInt();
		System.out.println("Sum of digit of string at index: " + n);

		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (i == n) {
					if (Character.isDigit(c)) {
						sum += Character.getNumericValue(c);

					}
				}

			}
		}
		System.out.println(sum);

	}

}
