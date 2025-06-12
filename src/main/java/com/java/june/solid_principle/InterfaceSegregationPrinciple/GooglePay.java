package com.java.june.solid_principle.InterfaceSegregationPrinciple;

public class GooglePay implements UPIPayments,CashBackManager{

	@Override
	public void payMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScratchCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCashBackAsCreditBalance() {
		// this feature is in Gpay
		
	}

}
