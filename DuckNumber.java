package in.logicalPrograms;

import java.util.Scanner;

public class DuckNumber {
	public static boolean checkNum(int num) {
		while(num!=0) {
			if(num%10==0) {
				return true;
			}
			num = num/10;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(checkNum(num)) {
			System.out.println("Duck");
		}else {
			System.out.println("Not Duck");
		}
		sc.close();
	}

}
