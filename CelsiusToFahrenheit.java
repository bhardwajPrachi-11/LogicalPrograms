package in.logicalPrograms;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tem into celsius");
		int cels = sc.nextInt();
		int fahr = (cels*9/5)+32;
		System.out.println("Converted temperature : " + fahr);
		sc.close();

	}

}
