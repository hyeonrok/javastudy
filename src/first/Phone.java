package first;

public class Phone {

	private String model;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	void powerOn() {
//		System.out.println(model + "의 전원을 켭니다");
	}
	
	void powerOff() {
//		System.out.println(model + "의 전원을 끕니다.");
	}
}
