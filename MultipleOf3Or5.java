package in.logicalPrograms;

import java.util.Scanner;

public class MultipleOf3Or5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		if((n1%3 == 0) || (n2%5 == 0)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		sc.close();

	}

}
