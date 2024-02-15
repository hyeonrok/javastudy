package test;

public class Studentscore {
	public static void main(String[] args) {
		
	int score1 = 80;
	int score2 = 60;
	int score3 = 90;
	int avg = (score1+score2+score3)/3;
	
	if(score1 >= 90) {
		System.out.println("당신의 학점은 A입니다");
	}else if(score1 >=80) {
		System.out.println("당신의 학점은 B입니다");
	}else if(score1>=70) {
		System.out.println("당신의 학점은 C입니다");
	}else if(score1 >=60) {
		System.out.println("당신의 학점은 D입니다.");
	}
	System.out.println("평균 : "+avg);
	}
}


