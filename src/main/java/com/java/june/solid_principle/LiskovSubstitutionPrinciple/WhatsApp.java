package com.java.june.solid_principle.LiskovSubstitutionPrinciple;

public class WhatsApp extends SocialMedia{

	@Override
	public void chatWithFriend() {
		
	}

	@Override
	public void publishPost(Object post) {
       //Not applicable		
	}

	@Override
	public void sendPhotosAndVideos() {
		
	}

	@Override
	public void groupVideoCall(String... users) {
		
	}

}
