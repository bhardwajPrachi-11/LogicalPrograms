package in.logicalPrograms;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter temperature into Fahrenheit");
		int fTemp = sc.nextInt();
		int cTemp = (fTemp*5/9)-32;
		System.out.println(cTemp);
		sc.close();

	}

}
