package in.logicalPrograms;

import java.util.Scanner;

public class NumberContainerUsingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String str = sc.nextLine();
		System.out.println("Enter digit");
		int digit = sc.nextInt();
		
		if(str.length() == digit) {
			System.out.println("true " + str.length());
		}
		else {
			System.out.println("false " + str.length());
		}
		sc.close();
	}

}
