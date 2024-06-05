package in.logicalPrograms;

import java.util.Scanner;

public class DivisionAndModulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number");
		int num2 = sc.nextInt();
		System.out.println((num1/num2) + " " + (num1%num2));
		sc.close();
		

	}

}
