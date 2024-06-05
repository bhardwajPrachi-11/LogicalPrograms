package in.logicalPrograms;

import java.util.Scanner;

public class BiggestOfFourNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		
		System.out.println("Enter fourth number");
		int n4 = sc.nextInt();
		
		int biggest = (Math.max(n1, Math.max(n2, Math.max(n3, n4))));
		System.out.println("Max number is : " + biggest);
		sc.close();
	}

}
