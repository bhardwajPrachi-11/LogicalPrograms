package in.logicalPrograms;

import java.util.Scanner;

public class MinOfThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		
		System.out.println("Min is : " + (Math.min(n1, (Math.min(n2, n3)))));
		
		sc.close();
	}

}
