
public class StringInteger {
	public static void main(String[] args) {

		StringInteger m = new StringInteger();
		String str1 = "ab5c2d4ef1s";
		System.out.println("The given string is: " + str1);

		System.out.println("The sum of the digits in the string is: " + m.sumOfDigits(str1));

	}

	public int sumOfDigits(String stng) {
		int l = stng.length();
		int sum = 0;

		for (int i = 0; i < l; i++) {
			char c = stng.charAt(i);
			if (Character.isDigit(stng.charAt(i))) {

				sum += Character.getNumericValue(stng.charAt(i));
				System.out.println("Show integer: " +stng.charAt(i));

			}
			System.out.println("show character: "+ c);
		}

		return sum;

	}

}
