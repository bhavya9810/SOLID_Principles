package com.java.june.solid_principle.DependencyInversionPrinciple;

public class DebitCard implements BankCard{
	
	public void doTransaction(long amount) {
		System.out.println("payment using debit card");

	}

}
