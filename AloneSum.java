package in.logicalPrograms;

import java.util.Scanner;

public class AloneSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value ");
		int a = sc.nextInt();
		
		System.out.print("Enter b value ");
		int b = sc.nextInt();
		
		System.out.print("Enter c value ");
		int c = sc.nextInt();
		
		if(a==b && b==c && a==c) {
			System.out.println("0");
		}
		else if(a!=b && b!=c && c!=a) {
			System.out.println("sum : " + (a+b+c));
		}
		else if(a==b) {
			System.out.println("sum : " + c);
		}
		else if(b==c) {
			System.out.println("sum : " + a);
		}
		sc.close();
	}

}
