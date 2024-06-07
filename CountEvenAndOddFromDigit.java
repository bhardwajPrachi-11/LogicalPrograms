package in.logicalPrograms;

import java.util.Scanner;

public class CountEvenAndOddFromDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int countEven = 0;
		int countOdd = 0;
		while(num!=0) {
			int n1 = num%10;
			if(n1%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
			num = num/10;
		}
		
		System.out.println("Count of even digit : " + countEven);
		System.out.println("Count of even digit : " + countOdd);
		sc.close();
	}
}
