package com.loanbuddy;

public class AutoLoan extends LoanApplication 
{	public AutoLoan( Applicant applicant, int term, double interestRate )
	{	super( applicant, term, interestRate );	
	}
	
	@Override
	public void approveLoan()
	{	if ( checkBasicEligibility() && applicant.getCreditScore() > 600 )
		{	setStatus( " Approved - Auto Loan " );		
		}
		else
		{	setStatus( " Rejected - Low Credit Score " );			
		}		
	}
	
	@Override
	public double calculateEMI()
	{	double p = applicant.getLoanAmount();
		double r = ( interestRate / 12 ) / 100;
		
		double emi = ( p * r * Math.pow( 1 + r, term ) ) / ( Math.pow( 1 + r, term ) - 1 );
		return emi;
	}
	

}
