import java.util.Arrays;
import java.util.Scanner;

//using extra space or store in another array
public class RemoveDuplicate {
	public static int remove(int arr[], int n) {

		int j = 0;
		int count = 0;
		int temp[] = new int[n];
		for (int k = 0; k < n; k++) {
			for (int l = k + 1; l < n; l++) {
				if (arr[k] == arr[l]) {
					arr[l] = arr[n - 1];
				}
			}
		}
		temp[j++] = arr[n - 1];
		return j;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scanner.nextInt();
		System.out.println("Enter the number of elements: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);

		int length = arr.length;
		length = remove(arr, length);
		System.out.println("Sorted array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
