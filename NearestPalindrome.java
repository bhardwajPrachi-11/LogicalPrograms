package in.logicalPrograms;

import java.util.Scanner;

public class NearestPalindrome {
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
		while(true) {
			int revNum = rev(num);
			if(revNum == num) {
				System.out.println("Nearest Palindrome number is : " + num);
				break;
			}
			num++;
		}
		sc.close();
	}
}
