package object;

public class ExSportsCar {

	public static void main(String[] args) {
		
		SportsCar sportsCar = new SportsCar();
		
		sportsCar.brand = "페라리";
		sportsCar.name = "우라칸";
		sportsCar.carType = 1;
		sportsCar.power = 252.64;
		
		System.out.println("sportsCar.brand : " + sportsCar.brand);
		System.out.println("sportsCar.name : " + sportsCar.name);
		System.out.println("sportsCar.carType : " + sportsCar.carType);
		System.out.println("sportsCar.power : " + sportsCar.power);

		
	}

}
