package object;

public class Excar {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		Car car3 = new Car("banz", "s100", 1, 523.432);
		
		car.brand = "Benz";
		car.name = "S class";
		car.carType = 1;
		car.power = 503.12;
		
		System.out.println("car.brand : " + car.brand);
		System.out.println("car.name : " + car.name);
		System.out.println("car.carType : " + car.carType);
		System.out.println("car.power : " + car.power);

		System.out.println("--------------------");
		
	
		
		car.brand = "Hyeondai";
		car.name = "Avente";
		car.carType = 2;
		car.power = 692.24;
		
		System.out.println("car.brand : " + car.brand);
		System.out.println("car.name : " + car.name);
		System.out.println("car.carType : " + car.carType);
		System.out.println("car.power : " + car.power);
		
		System.out.println("--------------------");
		
		
		car.brand = "Kia";
		car.name = "K3";
		car.carType = 2;
		car.power = 436.53;
		
		System.out.println("car.brand : " + car.brand);
		System.out.println("car.name : " + car.name);
		System.out.println("car.carType : " + car.carType);
		System.out.println("car.power : " + car.power);
		
		System.out.println("--------------------");

		
		car.go();
		car.back();
		car.left();
		car.right();
		
		System.out.println("--------------------");
		
		System.out.println("car.brand : " + car3.brand);
		System.out.println("car.name : " + car3.name);
		System.out.println("car.carType : " + car3.carType);
		System.out.println("car.power : " + car3.power);
	}

}
