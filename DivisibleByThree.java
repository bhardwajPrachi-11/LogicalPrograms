package in.logicalPrograms;

import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		if(num % 3 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
