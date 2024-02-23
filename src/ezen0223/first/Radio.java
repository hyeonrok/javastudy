package ezen0223.first;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Radio Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio Turn Off");
	}

	
}
