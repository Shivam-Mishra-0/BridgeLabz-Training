package com.loanbuddy;

public abstract class LoanApplication implements IApprovable 
{	protected Applicant applicant;
	protected int term;
	protected double interestRate;
	private String status;
	boolean isApproved = false;

	public LoanApplication(Applicant applicant, int term, double interestRate) 
	{	this.applicant = applicant;
		this.term = term;
		this.interestRate = interestRate;
		this.status = "Pending";
	}
	
	protected void setStatus(String newStatus)
	{	this.status = newStatus;		
	}
	
	protected String getStatus()
	{	return status;		
	}
	
	protected boolean checkBasicEligibility()
	{	return applicant.getLoanAmount() <= ( applicant.getIncome() * 10 );		
	}
}
