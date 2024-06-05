package in.logicalPrograms;

import java.util.Scanner;

public class Savings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Denver income");
		int dIncome = sc.nextInt();
		
		System.out.println("Enter Berlin income");
		int bIncome = sc.nextInt();
		
		System.out.println("Enter Rio income");
		int rIncome = sc.nextInt();
		
		System.out.println("Enter Denver expense");
		int dExpense = sc.nextInt();
		
		System.out.println("Enter Berlin expense");
		int bExpense = sc.nextInt();
		
		System.out.println("Enter Rio expense");
		int rExpense = sc.nextInt();
		
		int dSaving = (dIncome-dExpense);
		int bSaving = (bIncome-bExpense);
		int rSaving = (rIncome-rExpense);
		
//		System.out.println((((dSaving > bSaving) && (dSaving > rSaving)) ? dSaving : ((bSaving > rSaving) ? bSaving : rSaving)));
		
		if((dSaving > bSaving) && (dSaving > rSaving)) {
			System.out.println("Denver is having highest savings : " + dSaving);
		}
		
		else if((bSaving > rSaving)) {
			System.out.println("Berlin is having highest savings : " + bSaving);
		}
		
		else {
			System.out.println("Rio is having highest savings : " + rSaving);
		}
		
		sc.close();
	}

}
