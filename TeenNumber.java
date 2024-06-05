package in.logicalPrograms;

import java.util.Scanner;

public class TeenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		
		if((n1>=13 && n1<=19) || (n2>=13 && n2<=19)  || (n3>=13 && n3<=19)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
