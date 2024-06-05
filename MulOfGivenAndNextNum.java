package in.logicalPrograms;

import java.util.Scanner;

public class MulOfGivenAndNextNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int mul = num * (num+1);
		System.out.println("The mul is : " + mul);
		sc.close();

	}

}
