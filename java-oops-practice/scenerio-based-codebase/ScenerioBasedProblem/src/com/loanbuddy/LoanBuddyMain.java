package com.loanbuddy;

import java.util.*;

public class LoanBuddyMain {
    public static void main(String[] args) {
    		Scanner input = new Scanner ( System.in );
    		System.out.println("=== FinlyTech LoanBuddy System ===\n");
    		System.out.print (" Kindly Enter your name : ");
    		String userName = input.nextLine();
    		System.out.println();
    		System.out.print (" Enter your monthly income : ");
    		double userIncome = input.nextDouble();
    		System.out.println();
    		System.out.print (" Enter the amount of loan : ");
    		double userLoanAmount = input.nextDouble();
    		System.out.println();
    		System.out.print (" Enter your Credit Score : ");
    		int userCreditScore = input.nextInt();
    		System.out.println();
    		
        System.out.println("=== FinlyTech LoanBuddy System ===\n");
        Applicant applicant = new Applicant(userName, userIncome, userLoanAmount, userCreditScore);
        IApprovable applicantLoan = new HomeLoan(applicant, 120, 7.5);
        
        applicantLoan.approveLoan();
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Status: " + ((LoanApplication)applicantLoan).getStatus());
        System.out.printf("Monthly EMI: %.2f\n", applicantLoan.calculateEMI());
        System.out.println("---------------------------------");
        
        System.out.println("=== FinlyTech LoanBuddy System ===\n");
		System.out.print (" Kindly Enter your name : ");
		String userName2 = input.nextLine();
		System.out.println();
		System.out.print (" Enter your monthly income : ");
		double userIncome2 = input.nextDouble();
		System.out.println();
		System.out.print (" Enter the amount of loan : ");
		double userLoanAmount2 = input.nextDouble();
		System.out.println();
		System.out.print (" Enter your Credit Score : ");
		int userCreditScore2 = input.nextInt();
		System.out.println();
        Applicant applicant2 = new Applicant(userName2, userIncome2, userLoanAmount2, userCreditScore2);
        
        IApprovable applicant2Loan = new AutoLoan(applicant2, 36, 9.0);
        
        applicant2Loan.approveLoan();
        System.out.println("Applicant: " + applicant2.getName());
        System.out.println("Status: " + ((LoanApplication)applicant2Loan).getStatus());
        System.out.printf("Monthly EMI: %.2f\n", applicant2Loan.calculateEMI());
    }
}
