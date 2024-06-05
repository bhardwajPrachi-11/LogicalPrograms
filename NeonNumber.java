package in.logicalPrograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = ((n%10) + ((n/10)%10));
		int neonNum = (sum*sum);
		if(neonNum == n) {
			System.out.println("Number is neon");
		}else {
			System.out.println("Not a neon number");
		}
		sc.close();	
	}
}
