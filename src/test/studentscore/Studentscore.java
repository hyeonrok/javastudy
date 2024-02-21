package test.studentscore;

public class Studentscore {
	
	private int Score;
	private String subject;
	private String studentName;
	

	public Studentscore(int score, String subject, String studentName) {
		super();
		Score = score;
		this.subject = subject;
		this.studentName = studentName;
		
	}



	@Override
	public String toString() {
		return "Studentscore [Score=" + Score + ", subject=" + subject + ", studentName=" + studentName
				+ ", totalScore=" + ", personalScore=" +  "]";
	}



	public int getScore() {
		return Score;
	}



	public void setScore(int score) {
		Score = score;
	}



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



	



	
	
	public static void main(String[] args) {
		
		Studentscore studentscore = new Studentscore(80, "국어", "Tony");

		studentscore.Score = 70;
		
	
	}
	
}


