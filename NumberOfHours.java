package in.logicalPrograms;

import java.util.Scanner;

public class NumberOfHours {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in Seconds");
		int sec = sc.nextInt();
		int hour = sec/(60 *60);
		System.out.println("Converted time in hours " + hour);
		sc.close();
	}

}
