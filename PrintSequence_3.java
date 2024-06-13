package in.logicalPrograms;

import java.util.Scanner;

public class PrintSequence_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = sc.nextInt();
		int j = 10;
		for(int i=1;i<=num;i++) {
			System.out.print(j + " ");
			j = j+10;
		}
		sc.close();
	}

}
