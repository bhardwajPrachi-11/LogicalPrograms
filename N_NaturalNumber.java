package in.logicalPrograms;

import java.util.Scanner;

public class N_NaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
