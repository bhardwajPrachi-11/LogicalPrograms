package in.logicalPrograms;

import java.util.Scanner;

public class PrintNumberInWords {
	public static int rev(int num) {
		int reverse = 0;
		while(num!=0) {
			int n = num%10;
			reverse = reverse*10+n;
			num = num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int revNum = rev(num);
		while(revNum!=0) {
			int count = revNum%10;
			switch(count) {
			case 0:
				System.out.print(" Zero");
				break;
			case 1:
				System.out.print(" One");
				break;
			case 2:
				System.out.print(" Two");
				break;
			case 3:
				System.out.print(" Three");
				break;
			case 4:
				System.out.print(" Four");
				break;
			case 5:
				System.out.print(" Five");
				break;
			case 6:
				System.out.print(" Six");
				break;
			case 7:
				System.out.print(" Seven");
				break;
			case 8:
				System.out.print(" Eight");
				break;
			case 9:
				System.out.print(" Nine");
				break;
			}
			revNum = revNum/10;
		}
		sc.close();
	}

}
