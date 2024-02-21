package first;

public class ExCellPhone {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		phone.powerOn();
		phone.powerOff();
		
		phone.setColor("black");
		phone.setModel("Xs");
		
		phone.powerOn();
		phone.powerOff();
		
		System.out.println("phone.getColor() : " + phone.getColor());
		System.out.println("phone.getModel() : " + phone.getModel());
		
		phone.powerOn();
		phone.powerOff();
		
		CellPhone cellphone = new CellPhone();
		cellphone.setColor("black");
		cellphone.setModel("XR");
		cellphone.setTelecome("SKT");
		
		System.out.println("cellphone.getColor() : " + cellphone.getColor());
		System.out.println("cellphone.getModel() : " + cellphone.getModel());
		System.out.println("cellphone.getTelecome() : " + cellphone.getTelecome());
		
		System.out.println("---------------");
		
		cellphone.powerOn();
		cellphone.powerOff();
		System.out.println("--------------");
//		cellphone.powerOnCellPhone();
//		cellphone.powerOnCellPhone();

	}

}
