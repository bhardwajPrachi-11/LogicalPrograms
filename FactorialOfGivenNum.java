package in.logicalPrograms;

import java.util.Scanner;

public class FactorialOfGivenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get factorial");
		int num = sc.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial is : " + factorial);
		sc.close();
	}

}
