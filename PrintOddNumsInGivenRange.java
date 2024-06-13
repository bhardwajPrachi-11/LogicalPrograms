package in.logicalPrograms;

import java.util.Scanner;

public class PrintOddNumsInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Range");
		int n1 = sc.nextInt();
		System.out.println("Enter End Range");
		int n2 = sc.nextInt();
		for(int i=n1;i<=n2;i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
