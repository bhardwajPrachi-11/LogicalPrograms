package in.logicalPrograms;

import java.util.Scanner;

public class FootballPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Wins");
		int wins = sc.nextInt();
		
		System.out.println("Enter Number of Draws");
		int draws = sc.nextInt();
		
		System.out.println("Enter Number of Looses");
		int loose = sc.nextInt();
		int totalPoints = ((wins*3) + (draws*1) + (loose*0));
		System.out.println("Total points " + totalPoints);
		
		sc.close();
	}

}
