package in.logicalPrograms;

import java.util.Scanner;

public class ListOfPrimeNums {
	public static boolean isPrime(int n) {
		int fact = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				fact++;
			}
		}
		if(fact<=2) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range");
		int n1 = sc.nextInt();
		System.out.println("Enter ending range");
		int n2 = sc.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
