package in.logicalPrograms;

import java.util.Scanner;

public class TribonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 0;
		System.out.print(a + " " + b + " " + c + " ");
		for(int i=4;i<=num;i++) {
			d = a+b+c;
			System.out.print(d + " ");
			a=b;
			b=c;
			c=d;
		}
		sc.close();
	}

}
