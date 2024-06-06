package in.logicalPrograms;

import java.util.Scanner;

public class VaccinationDrive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of birth");
		int year = sc.nextInt();
		int age = 2024-year;
		if(age > 60) {
			System.out.println("Stage-1");
		}else if(age>=18 && age<=60) {
			System.out.println("Stage-2");
		}else {
			System.out.println("Stage-3");
		}
		sc.close();
	}

}
