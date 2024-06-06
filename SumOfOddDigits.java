package in.logicalPrograms;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			if(digit%2 != 0) {
				sum = sum+digit;
			}
			num = num/10;
		}
		System.out.println("Sum of odd digits of given number is : " + sum);
		sc.close();
	}

}
