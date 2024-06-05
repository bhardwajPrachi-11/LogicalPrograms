package in.logicalPrograms;

import java.util.Scanner;

public class StringLengthComparision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		System.out.println("Enter second String");
		String s2 = sc.nextLine();
		
		if(s1.length() == s2.length()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
