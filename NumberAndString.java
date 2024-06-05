package in.logicalPrograms;

import java.util.Scanner;

public class NumberAndString {

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter number either 0 or 1");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("Hello " + name);
		}
		else if(num == 0) {
			System.out.println("Bye " + name);
		}
		else {
			System.out.println("Enter valid number");
		}
		sc.close();
	}

}
