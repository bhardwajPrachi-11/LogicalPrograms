package in.logicalPrograms;

import java.util.Scanner;

public class SecureDataTransmission {
	public static int rev(int num) {
		int reverse = 0;
		while(num!=0) {
			int n = num%10;
			reverse = reverse*10+n;
			num = num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int revNumber = rev(num);
		System.out.println("Data to be transmitted : " + num);
		System.out.println("Data after transmission : " + revNumber);
		sc.close();

	}

}
