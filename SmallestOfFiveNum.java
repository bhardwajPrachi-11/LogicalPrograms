package in.logicalPrograms;

import java.util.Scanner;

public class SmallestOfFiveNum {

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
		
		System.out.println("Enter fifth number");
		int n5 = sc.nextInt();
		
		int smallest = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
		System.out.println("Smallest Number : " + smallest);
		sc.close();

	}

}
