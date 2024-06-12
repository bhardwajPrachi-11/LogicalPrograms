package in.logicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int digit = num;
		int cubeSum = 0;
		while(num!=0) {
			int n1 = num%10;
			cubeSum = cubeSum+(n1*n1*n1);
			num = num/10;
		}
		if(digit == cubeSum) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
