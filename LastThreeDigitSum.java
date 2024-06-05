package in.logicalPrograms;

import java.util.Scanner;

public class LastThreeDigitSum {
	
	//last three digit sum of a four digit number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number");
		int num = sc.nextInt();
		int sum = num%10 + (num/10)%10 + (num/100)%10;
		System.out.println("Sum is : " + sum);
		sc.close();

	}

}
