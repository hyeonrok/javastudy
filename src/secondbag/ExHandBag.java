package secondbag;

public class ExHandBag {

	public static void main(String[] args) {
		
		HandBag handBag = new HandBag();
		
		handBag.setBrand("Yale");
		handBag.setModel("backpack");
		handBag.setPrice(10000);
		
		System.out.println(handBag.getBrand());
		System.out.println(handBag.getModel());
		System.out.println(handBag.getPrice());
		
		System.out.println("--------------");
		
		System.out.println("handBag.getBrand() : " + handBag.getBrand() + "handBag.getModel() : " + handBag.getModel() + "handBag.getPrice() : " + handBag.getPrice());

		System.out.println("-----------");
		
		handBag.pricePrint();
		
		System.out.println("---------------");
		
		handBag.printBack();
	}

}
