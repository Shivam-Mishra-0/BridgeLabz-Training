package com.loanbuddy;

public class HomeLoan extends LoanApplication 
{	
	public HomeLoan( Applicant applicant, int term, double interestRate ) 
	{	super(applicant, term, interestRate );		
	}
	
	@Override 
	public void approveLoan()
	{	if ( checkBasicEligibility() && applicant.getCreditScore() > 700 )
		{	setStatus ( " Approved - Home Loan " );		
		}
		else
		{	setStatus ( " Rejected - Low Credit Score or Hogh Risk " );			
		}
	}
	
	@Override
	public double calculateEMI()
	{	double p = applicant.getLoanAmount();
		double r = ( interestRate / 12 ) / 100;
		
		double emi = (p * r * Math.pow(1 + p, term)) / (Math.pow(1 + r, term) - 1);
		return emi;
	}
	

}
