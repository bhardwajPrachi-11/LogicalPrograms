package in.logicalPrograms;

import java.util.Scanner;

public class NumberFollowedBySquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			int square = i*i;
			System.out.print(i + " " + square + " ");
		}
		sc.close();
	}

}
