package in.logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check it is prime or not");
		int num = sc.nextInt();
		int factor = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				factor++;
			}
		}
		if(factor==2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
