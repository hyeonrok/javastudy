package ezen0223.first;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Television Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Television Turn off");
	}
}
