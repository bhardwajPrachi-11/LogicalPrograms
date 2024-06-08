package in.logicalPrograms;

import java.util.Scanner;

public class CountryVisaCenter {
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
		System.out.println("Enter application Id");
		int appId = sc.nextInt();
		int revNum = rev(appId);
		while(revNum!=0) {
			int num = revNum%10;
			if(num%2==0) {
				System.out.print(num+1);
			}
			else {
				System.out.print(num-1);
			}
			revNum = revNum/10;
		}
		sc.close();
	}

}
