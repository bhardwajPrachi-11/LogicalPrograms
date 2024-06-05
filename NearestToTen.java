package in.logicalPrograms;

import java.util.Scanner;

public class NearestToTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		int n1 = Math.abs(num1 - 10);
		int n2 = Math.abs(num2 - 10);
		
		if(n1 < n2){
			System.out.println("Nearest to 10 is : " + num1);
		}
		else if(n1 == n2) {
			System.out.println("0");
		}
		else {
			System.out.println("nearest to 10 is : " + num2);
		}
		sc.close();	
	}

}
