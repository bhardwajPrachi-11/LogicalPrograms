package in.logicalPrograms;

import java.util.Scanner;

public class OneTimePassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order ID");
		int orderId = sc.nextInt();
		int product = 1;
		while(orderId != 0) {
			int n = orderId%10;
			product = product*n;
			orderId = orderId/10;
		}
		System.out.println("OTP generated is : " + product);
		sc.close();	
	}
}
