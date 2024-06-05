package in.logicalPrograms;

import java.util.Scanner;

public class CharacterToASCII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to get its ASCII value ");
		char ch =  sc.next().charAt(0);
		System.out.println((int)(ch));
		sc.close();
	}

}
