package in.logicalPrograms;

import java.util.Scanner;

public class StrongNumber {
	public static int sumOfFact(int num) {
		int sum = 0;
		while(num!=0) {
			int n = num%10;
			int fact = fact(n);
			sum = sum+fact;
			num = num/10;
		}
		return sum;
	}
	
	public static int fact(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		int num = sc.nextInt();
		int temp = num;
		int sumOfFact = sumOfFact(num);
		if(sumOfFact == temp) {
			System.out.println("strong number");
		}else {
			System.out.println("Not a strong Number");
		}
		
		sc.close();
	}

}
