package in.logicalPrograms;

import java.util.Scanner;

public class NextInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int i = sc.nextInt();
		i++;
		System.out.println("Inceremented value : " + i);
		sc.close();
	}

}
