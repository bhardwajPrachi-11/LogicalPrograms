package in.logicalPrograms;

import java.util.Scanner;

public class HappyNumber {
	public static int sum(int num) {
		int digit = 0;
		while(num!=0) {
			int n = num%10;
			digit = digit+n*n;
			num = num/10;
		}
		return digit;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int digit = sum(num);
		while(true) {
			if(digit>=1 && digit<=9) {
				if((digit == 1)) {
					System.out.println("Happy Number");
					break;
				}else {
					System.out.println("Not a happy Number");
					break;
				}
			}else {
				digit = sum(digit);
			}
		}
		sc.close();
	}

}
