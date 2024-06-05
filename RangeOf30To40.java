package in.logicalPrograms;

import java.util.Scanner;

public class RangeOf30To40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		if((n1>=30 && n1<=50) && (n2>=30 && n2<=50)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		sc.close();
	}

}
