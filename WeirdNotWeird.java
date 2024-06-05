package in.logicalPrograms;

import java.util.Scanner;

public class WeirdNotWeird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n%2 != 0) {
			System.out.println("not even :: Weird");
		}
		else{
			if((n>=2 && n<=5)) {
				System.out.println("even in range of 2-5 :: not weird");
			}
			else if((n>=6 && n<=20)) {
				System.out.println("even in range of 6-20 :: weird");
			}
			else if((n>20)) {
				System.out.println("even is greater than 20 :: not weird");
			}
		}
		sc.close();
	}
}
