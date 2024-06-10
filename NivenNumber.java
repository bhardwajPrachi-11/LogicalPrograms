package in.logicalPrograms;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is Niven or not");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int n = num%10;
			sum = sum+n;
			num = num/10;
		}
		if(temp%sum == 0) {
			System.out.println("Number is niven");
		}else {
			System.out.println("Not a niven number");
		}
		sc.close();
	}
}
