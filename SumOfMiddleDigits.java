package in.logicalPrograms;

import java.util.Scanner;

public class SumOfMiddleDigits {
	public static int rev(int num) {
		int reverse = 0;
		while(num!=0) {
			int n1 = num%10;
			reverse = reverse*10+n1;
			num = num/10;
		}
		return reverse;
	}
	public static int count(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = sc.nextInt();
		int num2 = rev(num1);
		int count = count(num1);
		System.out.println("count is : " + count);
		int sum = 0;
		int i  = 0;
		while(i<count/2) {
			sum = ((num1/10)%10+(num2/10)%10);
			num1 = num1/10;
			num2 = num2/10;
			i++;
		}
		System.out.println("sum is : " + sum);
		sc.close();
	}

}
