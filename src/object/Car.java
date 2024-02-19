package object;


public class Car {

	String brand;
	String name;
	int carType;
	double power;
	
	Car(String brand, String name, int carType, double power) {
		this.brand = brand;
		this.name = name;
		this.carType = carType;
		this.power = power;
	}
	
	Car(){
		
	}
	
	 void go() {
		System.out.println("앞으로 갑니다");
	 }
	 void back() {
		System.out.println("뒤로 갑니다.");
	}
	
	 void left() {
		System.out.println("좌회전");
	}
	
	 void right() {
		System.out.println("우회전");
	}
	
}
