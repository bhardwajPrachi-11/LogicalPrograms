package in.logicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("NUmber is odd");
		}
		sc.close();
	}

}
