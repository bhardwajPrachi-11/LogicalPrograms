package in.logicalPrograms;

import java.util.Scanner;

public class DigitalRoot {
	public static int sum(int num) {
		int sumOfDigit = 0;
		while(num!=0) {
			int n = num%10;
			sumOfDigit = sumOfDigit+n;
			num = num/10;
		}
		return sumOfDigit;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sumOfDigit = sum(num);
		while(true) {
			if(sumOfDigit>=0 && sumOfDigit<=9) {
				System.out.println("The Digital root of given number is : " + sumOfDigit);
				break;
			}else {
				sumOfDigit = sum(sumOfDigit);
			}
		}
		sc.close();
	}
}
