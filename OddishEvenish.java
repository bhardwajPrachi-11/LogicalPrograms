package in.logicalPrograms;

import java.util.Scanner;

public class OddishEvenish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int n = num%10;
			sum = sum+n;
			num = num/10;
		}
		if(sum%2==0) {
			System.out.println("Given number is evenish the sum is " + sum);
		}else {
			System.out.println("Given number is oddish the sum is " + sum);
		}
		sc.close();
	}

}
