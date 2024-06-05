package in.logicalPrograms;

import java.util.Scanner;

public class AddingTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int int1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int int2 = sc.nextInt();
		System.out.println("Addition : " + (int1 + int2));
		sc.close();
	}

}
