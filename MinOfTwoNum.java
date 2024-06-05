package in.logicalPrograms;

import java.util.Scanner;

public class MinOfTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		if(n1 < n2) {
			System.out.println("Min is : " + n1);
		}else {
			System.out.println("Min is : " + n2);
		}
		
		System.out.println("Min is : " + Math.min(n1, n2));
		
		sc.close();

	}

}
