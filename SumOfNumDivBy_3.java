package in.logicalPrograms;

import java.util.Scanner;

public class SumOfNumDivBy_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum is : " + sum);
		sc.close();
	}

}
