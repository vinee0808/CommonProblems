
public class CheckPrime {
	public static void main(String[] args) {
		int n = 27;
		boolean isPrime = true;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				isPrime = false;
				System.out.println(n + " is not a prime number");
				break;
			}
		}
		if (isPrime == true) {
			System.out.print(n + " is a prime number");
		}

		

	}

}
