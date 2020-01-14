import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
	public static void main(String[] args) {
		int n, m, flag;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the lower bound: ");
		n= scanner.nextInt();
		
		System.out.println("Enter the upper bound: ");
		m=scanner.nextInt();
		
		System.out.println("Prime number between "+n +" and "+m);
		
		for(int i=n; i<=m; i++) {
		 flag= 1;
			for(int j=2; j<=i-1; j++) {
				if(i%j==0) {
					flag= 0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(i);
				System.out.print("\t");
			}
		}
	}

}
