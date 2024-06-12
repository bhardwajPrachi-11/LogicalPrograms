package in.logicalPrograms;

import java.util.Scanner;

public class AverageOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		while(num!=0) {
			int n = num%10;
			sum = sum+n;
			count++;
			num = num/10;
		}
		System.out.println("Sum is : " + sum);
		System.out.println("Count of digit is : " + count);
		int average = sum/count;
		System.out.println("Average : " + average);
		sc.close();
	}
}
