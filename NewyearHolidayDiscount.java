package in.logicalPrograms;

import java.util.Scanner;

public class NewyearHolidayDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter billed amount");
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		while(num!=0) {
			int n1 = num%10;
			if(n1%2==0) {
				evenSum = evenSum+n1;
			}else {
				oddSum = oddSum+n1;
			}
			
			num = num/10;
		}
		int product = evenSum*oddSum;
		System.out.println("Total NewYear Holiday discount : " + product);
		sc.close();	
	}
}
