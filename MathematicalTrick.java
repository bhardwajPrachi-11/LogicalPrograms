package in.logicalPrograms;

import java.util.Scanner;

public class MathematicalTrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num!=0) {
			int n = num%10;
			System.out.print(n*n);
			num = num/10;
		}
		sc.close();

	}

}
