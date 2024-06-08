package in.logicalPrograms;

import java.util.Scanner;

public class NumberContainer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Enter digit");
		int digit = sc.nextInt();
		int count = 0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		
		if(count == digit) {
			System.out.println("true " + count);
		}else {
			System.out.println("false " + count);
		}
		sc.close();
	}

}
