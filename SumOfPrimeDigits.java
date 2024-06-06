package in.logicalPrograms;

import java.util.Scanner;

public class SumOfPrimeDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			if(digit==2 || digit==3 || digit==5 || digit==7) {
				sum = sum+digit;
			}
			num = num/10;
		}
		System.out.println("Sum of prime digits in the given number are : " + sum);
		sc.close();
	}

}
