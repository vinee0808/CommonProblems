import java.util.Scanner;

public class RemoveCommonChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = scanner.nextLine();
		String commonChar = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					commonChar += str1.charAt(i);
				}
			}

		}
		for (int i = 0; i < commonChar.length(); i++) {
			String charToRemove = commonChar.charAt(i) + "";
			
			str1 = str1.replace(charToRemove, "");
			str2 = str2.replace(charToRemove, "");

		}
		
		//pritamSystem.out.println(commonChar);
		System.out.println(str1);
		System.out.println(str2);

	}

}
