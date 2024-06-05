package in.logicalPrograms;

import java.util.Scanner;

public class InvertColors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first color code");
		int r = sc.nextInt();
		
		System.out.println("Enter second color code");
		int g = sc.nextInt();
		
		System.out.println("Enter third color code");
		int b = sc.nextInt();
		
		System.out.println("inverted value are : " + ((255-r) +" "+ (255-g) +" "+ (255-b)));
		sc.close();
	}

}
