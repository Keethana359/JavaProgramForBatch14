package com.keerthana.selenium;

public interface PhoneAction {
	public void call(String pnumber);
	public void hang();
	public void sendMessage(String pNumber, String message);
	public void takePhoto();
	public void playMusic();
}
