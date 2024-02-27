package helloworld;

public class Constant {

	private String subject;
	private String studentName;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Constant(String subject, String studentName) {
		this.subject = subject;
		this.studentName = studentName;
	}
	
	public Constant() {
		
	}
	
	
	
}
