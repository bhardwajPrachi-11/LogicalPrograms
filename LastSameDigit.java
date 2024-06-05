package in.logicalPrograms;

import java.util.Scanner;

public class LastSameDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number");
		int n2 = sc.nextInt();
		if((n1%10) == (n2%10)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
