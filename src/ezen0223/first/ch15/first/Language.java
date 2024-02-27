package ezen0223.first.ch15.first;

public class Language {

	private String name;
	private int version;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
//	
//	public Language(String name, int version) {
//		this.name = name;
//		this.version = version;
//	}
//	
	public Language(String a, int b) {
//		setName(a);
//		setVersion(b);
		
		name = a;
		version = b;
	}
	public Language() {
		
	}
	
	
	
}
