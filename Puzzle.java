package in.logicalPrograms;

import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int cube = num*num*num;
		if((cube%10) == num) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
