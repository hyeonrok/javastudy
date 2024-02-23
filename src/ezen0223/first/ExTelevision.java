package ezen0223.first;

public class ExTelevision {

	public static void main(String[] args) {

		Television television = new Television();
		
		television.turnOff();
		television.turnOn();
		
		System.out.println("-----------------");
		
		Radio radio = new Radio();
		
		radio.turnOff();
		radio.turnOn();
		
		System.out.println("-----------------");
		
		RemoteControl remoteControl = new Radio();
		
		remoteControl.turnOff();
		remoteControl.turnOn();
		
		System.out.println("-----------------");
		
		RemoteControl remoteControl2 = new Television();
		
		remoteControl2.turnOff();
		remoteControl2.turnOn();

	}

}
