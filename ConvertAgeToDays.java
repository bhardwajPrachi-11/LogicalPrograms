package in.logicalPrograms;

import java.util.Scanner;

public class ConvertAgeToDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age into years");
		int age = sc.nextInt();
		int days = age*365;
		System.out.println(days);
		sc.close();
	}

}
