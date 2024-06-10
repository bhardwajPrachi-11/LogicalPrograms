package in.logicalPrograms;

import java.util.Scanner;

public class ChristmasOffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter billed amount");
		int bill = sc.nextInt();
		int discount = 0;
		while(bill!=0) {
			int n = bill%10;
			if(n==2 || n==3 || n==5 || n==7) {
				discount = discount+n;
			}
			bill = bill/10;
		}
		System.out.println("Discount is : " + discount);
		sc.close();
	}

}
