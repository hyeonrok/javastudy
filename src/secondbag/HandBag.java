package secondbag;

public class HandBag extends Bag {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void pricePrint() {
		System.out.println("가격은 : " + price);
	}

	@Override
	void printBack() {
		System.out.println("브랜드는 : " + getBrand() + " 모델은 : " + getModel() + " 가격은 : " + price);
	}
	
}
