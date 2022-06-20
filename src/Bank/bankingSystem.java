package Bank;

import java.util.Scanner;

public class bankingSystem {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a,b;
		System.out.println("Enter number one: ");
		a = myScanner.nextInt();
		System.out.println("Enter number two: ");
		b = myScanner.nextInt();
		int result = a+b;
		System.out.println("The result is: "+result);
	}
}
