package in.logicalPrograms;

import java.util.Scanner;

public class LuggageWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight of first bag");
		int w1 = sc.nextInt();
		
		System.out.println("Enter weight of second bag");
		int w2 = sc.nextInt();
		
		System.out.println("Enter weight of third bag");
		int w3 = sc.nextInt();
		
		System.out.println("Enter total allowed weight of two checkin bags");
		int l1 = sc.nextInt();
		
		System.out.println("Enter total allowed weight of one cabin bag");
		int l2 = sc.nextInt();
		
		if((w1+w2+w3) <= (l1+l2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
