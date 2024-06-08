package in.logicalPrograms;

import java.util.Scanner;

public class ECommerceDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter billed amount");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int n1 = num%10;
			if(n1%2 != 0) {
				sum = sum+n1;
			}
			num = num/10;
		}
		System.out.println("Total Discount percentage is : " + sum);
		sc.close();
	}

}
