package in.logicalPrograms;

import java.util.Scanner;

public class SumOfNumDivBy_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int digit = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=digit;i++) {
			if(i%5==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum is : " + sum);
		sc.close();
	}

}
