package in.logicalPrograms;

import java.util.Scanner;

public class MinDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int min = 10;
		while(num!=0) {
			int n = num%10;
			if(min>n) {
				min = n;
			}
			num = num/10;
		}
		System.out.println("Min digit in the given number is : " + min);
		sc.close();
	}

}
