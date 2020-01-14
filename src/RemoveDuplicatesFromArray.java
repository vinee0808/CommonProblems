
import java.util.Arrays;
import java.util.Scanner;

//using extra space or store in another array
public class RemoveDuplicatesFromArray {
	public static int remove(int arr[], int n) {

		int j = 0;
		int count = 0;
		for (int k = 0; k < n - 1; k++) {
			if (arr[k] != arr[k + 1]) {
				arr[j] = arr[k];
				 j++;
			}
			if(arr[k] == arr[k + 1]) {
				System.out.println(k);
				count++;
			}
		}
		arr[j++] = arr[n - 1];
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
			System.out.print( arr[i] + ", ");
		}

	}

}
