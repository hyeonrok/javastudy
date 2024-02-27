package helloworld;

public class Score extends Constant{

	private int koreanScore;
	private int englishScore;
	private int mathScore;
	
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public Score(String subject, String studentName, int koreanScore, int englishScore, int mathScore) {
		super(subject, studentName);
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public Score() {
		
	}
	
	public Score1(String subject, String studentName, int koreanScore, int englishScore, int mathScore) {
		super(subject, studentName);
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public Score1() {
		
	}
	
	@Override
	public String toString() {
		return getStudentName() + "의 " + getSubject() + " 성적 : ";
	}
	
	
}
