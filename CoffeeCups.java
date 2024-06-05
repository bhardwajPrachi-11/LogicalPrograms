package in.logicalPrograms;

import java.util.Scanner;

public class CoffeeCups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of purchased coffee mugs");
		int n = sc.nextInt();
		int totalCoffeeMugs = n+n/6;
		System.out.println("Total number of coffee mugs you will get is : " + totalCoffeeMugs);
		sc.close();
	}

}
