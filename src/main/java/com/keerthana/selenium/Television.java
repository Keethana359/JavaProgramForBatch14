package com.keerthana.selenium;

public abstract class Television {
	public int volume;
	public int channel;

	public Television(int volume, int channel) {
		this.volume = volume;
		this.channel = channel;
	}

	public void volumeup(int increase) {
		volume += increase;
	}

	public void volumedown(int decrease) {
		volume -= decrease;
	}

	public void countup(int increase) {
		channel += increase;
	}

	public void countdown(int decrease) {
		channel -= decrease;
	}
// current volume
	public int getvolumn() {
		return this.volume;
	}
	
	@Override
	public String toString() {
		return "Television [volume=" + volume + ", channel=" + channel + "]";
	}

	public void method3() {
	}
	

	

	
  
}
