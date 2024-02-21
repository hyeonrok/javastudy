package secondbag;

public class Bag {

	private String brand;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	void printBack() {
		System.out.println("브랜드는 : " + brand + " 모델은 : " + model);
	}
	
	
}
