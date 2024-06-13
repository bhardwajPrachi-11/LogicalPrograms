package in.logicalPrograms;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int num = sc.nextInt();
		int a = -1;
		int b = 1;
		int c  = 0;
		for(int i=1;i<=num;i++) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		
		sc.close();
	}

}
