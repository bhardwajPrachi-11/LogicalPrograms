package in.logicalPrograms;

import java.util.Scanner;

public class DataEncode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Enter digit");
		int digit = sc.nextInt();
		int count = 0;
		while(num!=0) {
			int n = num%10;
			if(n==digit) {
				count++;
			}
			num = num/10;
		}
		System.out.println("Count of given digit : " + count);
		sc.close();
	}

}
