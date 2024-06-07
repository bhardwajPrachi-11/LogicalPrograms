package in.logicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int givenNum = num;
		int rev = 0;
		while(num!=0) {
			int n1 = num%10;
			rev = rev*10+n1;
			num = num/10;
		}
		if(givenNum == rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Not a palindrome number");
		}
		
		sc.close();
	}

}
