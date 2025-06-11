package com.java.june.solid_principle.OpenClosedPrinciple;

public interface NotificationService {
	
	public void sendOTP(String medium);
	
	public void sendTransactionReport(String medium);

}
