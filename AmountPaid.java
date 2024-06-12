package in.logicalPrograms;

import java.util.Scanner;

public class AmountPaid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Pencils bought");
		int numP = sc.nextInt();
		System.out.println("Enter number of Erasers bought");
		int numE = sc.nextInt();
		int totalSum = (numP*7 + numE*5);
		System.out.println("Total sum is : " + totalSum);
		sc.close();
	}
}
