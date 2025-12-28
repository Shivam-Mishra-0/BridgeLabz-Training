package com.constructor.level01;

public class BankAccountManagement {

	public BankAccountManagement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount account =
	             new SavingsAccount("SB1001", "Ayush Mishra", 5000.0, 4.5);

	     account.displayAccountDetails();

	     System.out.println("\nDepositing ₹2000...\n");
	     account.deposit(2000);

	     account.displayAccountDetails();

	     System.out.println("\nWithdrawing ₹3000...\n");
	     account.withdraw(3000);

	     account.displayAccountDetails();
	}

}
