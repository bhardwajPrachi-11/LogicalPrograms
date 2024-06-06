package in.logicalPrograms;

import java.util.Scanner;

public class EmployeeRatingPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ERP to know ERG");
		int point  = sc.nextInt();
		if(point>=30 && point<=50) {
			System.out.println("ERG-D");
		}
		else if(point>=51 && point<=60) {
			System.out.println("ERG-C");
		}
		else if(point>=61 && point<=80) {
			System.out.println("ERG-B");
		}
		else {
			System.out.println("ERG-A");
		}
		
		sc.close();
	}

}
