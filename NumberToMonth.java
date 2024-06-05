package in.logicalPrograms;

import java.util.Scanner;

public class NumberToMonth {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Jan");
		}
		else if(n==2) {
			System.out.println("Feb");
		}
		else if(n==3) {
			System.out.println("Mar");
		}
		else if(n==4) {
			System.out.println("Apr");
		}
		else if(n==5) {
			System.out.println("May");
		}
		else if(n==6) {
			System.out.println("Jun");
		}
		else if(n==7) {
			System.out.println("July");
		}
		else if(n==8) {
			System.out.println("Aug");
		}
		else if(n==9) {
			System.out.println("Sept");
		}
		else if(n==10) {
			System.out.println("Oct");
		}
		else if(n==11) {
			System.out.println("Nov");
		}
		else if(n==12) {
			System.out.println("Dec");
		}
		else {
			System.out.println("invalid number");
		}
		sc.close();
	}

}
