package Bank;

import java.util.Scanner;

public class bankingSystem {
	public static void main(String[] args) {
		
	}
	
		class bankAccount{
			int balance;
			int previousTransaction;
			String customerName;
			String customerID;
			
			
			bankAccount(String cname, String cid) {
				customerName = cname;
				customerID = cid;
			}
			
			//Balance Inforamtion
			void deposit(int amount) {
				if (amount !=0) {
					balance = balance+amount;
					previousTransaction = amount;
				}
			}
			
			
			//Withdrawn Information
			void withdraw(int amount) {
				if (amount !=0) {
					balance = balance-amount;
					previousTransaction = -amount;
				}
			}
			
			//Transaction calculation
			void getPreviousTransction() {
				if (previousTransaction > 0) {
					System.out.println("Deposited: "+previousTransaction);
				}else if (previousTransaction < 0) {
					System.out.println("Withdrawn: "+Math.abs(previousTransaction));
				}else {
					System.out.println("No transction happen");
				}
			}
			
			//Menu show 
			void showMenu() {
				char option = '\0';
				Scanner myScanner = new Scanner(System.in);
				System.out.println("Welcome!"+customerName);
				System.out.println("Your id is: "+customerID);
				System.out.println("\n");
				System.out.println("A. Check Balance");
				System.out.println("B. Deposit");
				System.out.println("C. Withdraw");
				System.out.println("D. Previous Transaction");
				System.out.println("E. Exit");
				
				do {
					System.out.println("*******************************************");
					System.out.println("Enter an option:");
					System.out.println("*******************************************");
					option = myScanner.next().charAt(0);
					System.out.println("\n");
				}
			}
	}
}
