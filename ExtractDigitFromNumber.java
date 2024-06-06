package in.logicalPrograms;

import java.util.Scanner;

public class ExtractDigitFromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num!=0) {
			int digit = num%10;
			System.out.print(digit +" ");
			num = num/10;
		}
		sc.close();
	}

}
