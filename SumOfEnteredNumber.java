package in.logicalPrograms;

import java.util.Scanner;

public class SumOfEnteredNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do {
			System.out.println("Enter number");
			num = sc.nextInt();
			sum = sum+num;
		}while(num!=0);
		System.out.println("Sum of entered digit is : " + sum);
		sc.close();
	}

}
