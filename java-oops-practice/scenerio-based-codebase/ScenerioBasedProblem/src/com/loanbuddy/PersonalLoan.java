package com.loanbuddy;

public class PersonalLoan extends LoanApplication 
{	

	public PersonalLoan( Applicant applicant, double interestRate, int term ) 
	{	super( applicant, term, interestRate );		
	}
	
	@Override
	public void approveLoan()
	{	boolean highCredit = applicant.getCreditScore() >= 750;
		boolean decentIncome = applicant.getIncome() >= 50000;
		
		if ( checkBasicEligibility() && highCredit && decentIncome )
		{	setStatus ( " Approved - Personal Loan " );			
		}
		else
		{	setStatus ( " Rejected - High Risk for Personal Loan " );			
		}
	}
	
	@Override
	public double calculateEMI()
	{	double processingFee = applicant.getLoanAmount() * 14;
		double p = applicant.getLoanAmount() + processingFee;
		
		double r = ( interestRate / 12 ) / 100;
		double emi = ( p * r * Math.pow( 1 + r, term ) ) / ( Math.pow( 1 + r, term ) - 1 );
		return emi;
	}

}
