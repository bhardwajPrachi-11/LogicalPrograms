package in.logicalPrograms;

import java.util.Scanner;

public class EvenOrOddLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		if(count%2==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
