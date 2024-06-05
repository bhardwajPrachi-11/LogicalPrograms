package in.logicalPrograms;

import java.util.Scanner;

public class MemorySize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter memory size in GB");
		int mSize =  sc.nextInt();
		double actualSize = mSize-0.007;
		System.out.println("Actual Size : " + actualSize);
		sc.close();

	}

}
