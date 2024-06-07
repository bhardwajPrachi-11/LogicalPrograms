package in.logicalPrograms;

import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int max = 0;
		while(n!=0) {
			int num = n%10;
			if(num > max) {
				max = num;
			}
			n = n/10;
		}
		System.out.println("Max digit is : " + max);
		sc.close();
	}

}
