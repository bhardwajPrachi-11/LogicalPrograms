package in.logicalPrograms;

import java.util.Scanner;

public class GlobalAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter batch of advertisements");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			int n1 = num%10;
			if(n1%2==0) {
				count++;
			}
			num = num/10;
		}
		System.out.println("Total add to be displayed from given bath is : " + count);
		sc.close();
	}

}
