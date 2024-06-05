package in.logicalPrograms;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Voltage");
		int voltage = sc.nextInt();
		System.out.println("Enter Current");
		int current = sc.nextInt();
		int power = voltage*current;
		System.out.println(power);
		sc.close();

	}

}
