package in.logicalPrograms;

import java.util.Scanner;

public class NumberOfMonths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days to get month");
		int days = sc.nextInt();
		int month = days/30;
		System.out.println(month);
		sc.close();
	}

}
