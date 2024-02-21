package first;

public class CellPhone extends Phone{

	private String telecome;

	public String getTelecome() {
		return telecome;
	}

	public void setTelecome(String telecome) {
		this.telecome = telecome;
	}
	
//	void powerOnCellPhone() {
//		System.out.println("cell phone의 전원을 켭니다");
//	}
//	
//	void powerOffCellPhone() {
//		System.out.println("cell phone의 전원을 끕니다.");
//	}

	@Override
	void powerOn() {
		System.out.println("cell phone의 전원을 켭니다");
		super.powerOn();
	}

	@Override
	void powerOff() {
		System.out.println("cell phone의 전원을 끕니다.");
		super.powerOff();
	}
	
	
}
