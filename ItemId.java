package in.logicalPrograms;

import java.util.Scanner;

public class ItemId {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item Id");
		int itemId = sc.nextInt();
		int max = 0;
		while(itemId!=0) {
			int num = itemId%10;
			if(num>max) {
				max=num;
			}
			itemId = itemId/10;
		}
		System.out.println("Bucket Id : " + max);
		sc.close();
	}
}
