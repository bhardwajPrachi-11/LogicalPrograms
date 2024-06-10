package in.logicalPrograms;

import java.util.Scanner;

public class PlayersScore {
	public static int rev(int num) {
		int reverse = 0;
		while(num!=0) {
			int n1 = num%10;
			reverse = reverse*10+n1;
			num = num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int revNum = rev(num);
		int score = (num-revNum);
		System.out.println("Player's score is : " + Math.abs(score));
		sc.close();
	}
}
