package helloworld;

public class Score extends Constant{

	private int tonymathScore;
	private int tonyEnglishScore;
	private int tonyKoreanScore;
	
	private int jennyMathScore;
	private int jennyEnglishScore;
	private int jennyKoreanScore;
	
	private int iuMathScore;
	private int iuEnglishScore;
	private int iuKoreanScore;
	
	public int getTonymathScore() {
		return tonymathScore;
	}


	public void setTonymathScore(int tonymathScore) {
		this.tonymathScore = tonymathScore;
	}


	public int getTonyEnglishScore() {
		return tonyEnglishScore;
	}


	public void setTonyEnglishScore(int tonyEnglishScore) {
		this.tonyEnglishScore = tonyEnglishScore;
	}


	public int getTonyKoreanScore() {
		return tonyKoreanScore;
	}


	public void setTonyKoreanScore(int tonyKoreanScore) {
		this.tonyKoreanScore = tonyKoreanScore;
	}

	

	public int getJennyMathScore() {
		return jennyMathScore;
	}


	public void setJennyMathScore(int jennyMathScore) {
		this.jennyMathScore = jennyMathScore;
	}


	public int getJennyEnglishScore() {
		return jennyEnglishScore;
	}


	public void setJennyEnglishScore(int jennyEnglishScore) {
		this.jennyEnglishScore = jennyEnglishScore;
	}


	public int getJennyKoreanScore() {
		return jennyKoreanScore;
	}


	public void setJennyKoreanScore(int jennyKoreanScore) {
		this.jennyKoreanScore = jennyKoreanScore;
	}


	public int getIuMathScore() {
		return iuMathScore;
	}


	public void setIuMathScore(int iuMathScore) {
		this.iuMathScore = iuMathScore;
	}


	public int getIuEnglishScore() {
		return iuEnglishScore;
	}


	public void setIuEnglishScore(int iuEnglishScore) {
		this.iuEnglishScore = iuEnglishScore;
	}


	public int getIuKoreanScore() {
		return iuKoreanScore;
	}


	public void setIuKoreanScore(int iuKoreanScore) {
		this.iuKoreanScore = iuKoreanScore;
	}
	
	
	void tonyAvg() {
		System.out.println("Tony의 평균 : " + (tonymathScore + tonyEnglishScore + tonyKoreanScore)/3 );
	}
	
	void tonySum() {
		System.out.println("Tony의 총합 : " + tonymathScore + tonyEnglishScore + tonyKoreanScore);
	}
}
