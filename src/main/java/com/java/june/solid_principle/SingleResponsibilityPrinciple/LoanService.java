package com.java.june.solid_principle.SingleResponsibilityPrinciple;

public class LoanService {
	
public void getLoanInterestInfo(String loanInfo) {
		
		if(loanInfo.equals("homeLoan")) {
			//do some job
		}
		if(loanInfo.equals("carLoan")) {
			//do some work
		}
		if(loanInfo.equals("personalLoan")) {
			//do some work
		}
	}

}
