package in.logicalPrograms;

import java.util.Scanner;

public class SuperMarketPricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of item");
		int itemCode = sc.nextInt();
		int price = 1;
		while(itemCode!=0) {
			int n = itemCode%10;
			price = price*n;
			itemCode = itemCode/10;
		}
		System.out.println("Price of item is : " + price);
		sc.close();
	}
}
