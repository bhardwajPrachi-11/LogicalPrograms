package in.logicalPrograms;

import java.util.Scanner;

public class N_NaturalNumbersReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = sc.nextInt();
		for(int i=num;i>=1;i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
