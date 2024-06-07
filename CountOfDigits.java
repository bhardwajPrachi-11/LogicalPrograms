package in.logicalPrograms;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		System.out.println("Count is : " + count);
		sc.close();
	}

}
