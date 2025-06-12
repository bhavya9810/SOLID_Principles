package com.java.june.solid_principle.DependencyInversionPrinciple;

public class ShoppingMall {
	
	private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard){
		
		this.bankCard=bankCard;
		
	}
	
	public void doPurchaseSomething(long amount) {
		
		bankCard.doTransaction(amount);
		
	}
	
	
	public static void main(String[] args) {
		
//		DebitCard debitcard=new DebitCard();
		
		
		BankCard bankCard=new CreditCard();
		ShoppingMall shoppingMall=new ShoppingMall(bankCard);
		
		shoppingMall.doPurchaseSomething(1000);
		
	}

}
