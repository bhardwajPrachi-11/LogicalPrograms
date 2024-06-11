package in.logicalPrograms;

import java.util.Scanner;

public class DecrementDigitByOneUnit {
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
		System.out.println("Enter number");
		int num = sc.nextInt();
		int revNum = rev(num);
		while(revNum!=0) {
			int n1 = revNum%10;
			System.out.print(n1-1);
			revNum = revNum/10;
		}
		sc.close();
	}
}
