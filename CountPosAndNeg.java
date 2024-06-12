package in.logicalPrograms;

import java.util.Scanner;

public class CountPosAndNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int countPos = 0;
		int countNeg = 0;
		do {
			System.out.println("Enter Numbers");
			num = sc.nextInt();
			if(num > 0) {
				countPos++;
			}else if(num < 0) {
				countNeg++;
			}
		}while(num!=0);
		System.out.println("Postive number count : " + countPos);
		System.out.println("Negative number count : " + countNeg);
		sc.close();
	}

}
