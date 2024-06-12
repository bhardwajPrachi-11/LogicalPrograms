package in.logicalPrograms;

import java.util.Scanner;

public class N_OddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
