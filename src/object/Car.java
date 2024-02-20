package object;


public class Car {

	String brand;
	String name;
	int carType;
	double power;
	
	private int aaa;
	
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public int getAaa() {
		return aaa;
	}

	public void setAaa(int aaa) {
		this.aaa = aaa;
	}
	 
	
}
