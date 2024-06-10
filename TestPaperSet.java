package in.logicalPrograms;

import java.util.Scanner;

public class TestPaperSet {
	public static int sum(int num) {
		int sumOfDigit = 0;
		while(num!=0) {
			int n1 = num%10;
			sumOfDigit = sumOfDigit+n1;
			num = num/10;
		}
		return sumOfDigit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ApplicationId");
		int appId = sc.nextInt();
		int sumOfDigit = sum(appId);
		while(true) {
			if(sumOfDigit>=1 && sumOfDigit<=26) {
				char digit = (char) (sumOfDigit+64);
				System.out.println("Set Number is : "+ digit);
				break;
			}
			else {
				sumOfDigit = sum(sumOfDigit);
			}	
		}
		sc.close();
	}
}
