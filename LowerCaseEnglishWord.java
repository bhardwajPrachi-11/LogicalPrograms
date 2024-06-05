package in.logicalPrograms;

import java.util.Scanner;

public class LowerCaseEnglishWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		String[] str = {"Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		try {
			System.out.println(str[n]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter valid number between 1-9");
		}
		sc.close();
	}

}
