import java.util.Scanner;

public class NthOfFabonacci {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1= scanner.nextInt();
		System.out.println("Enter the second number: ");
		int n2= scanner.nextInt();
		System.out.println("Enter the number of count: ");
		int n= scanner.nextInt();
		int sum;
		System.out.println(n+ "th number of the series: ");
		for(int i=3; i<=n; i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			if(i==10) {
				System.out.println(sum);
			}
		}
	}

}
