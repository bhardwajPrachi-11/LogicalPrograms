package in.logicalPrograms;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {
	
	public static int rev(int num) {
		int rev = 0;
		while(num!=0) {
			int n1 = num%10;
			rev = rev*10+n1;
			num = num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int reverse = rev(num);
		System.out.println("Given number is : " + num);
		System.out.println("Reverse of given number is : " + reverse);
		int sum = num%10 + reverse%10;
		System.out.println("Sum of first and last digit of given number is : " + sum);
		sc.close();
	}	
}
