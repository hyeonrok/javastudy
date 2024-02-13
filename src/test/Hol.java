package test;

public class Hol {

	public static void main(String[] args) {
		int i = -2;
		
		if(i < 0) {
			System.out.println("0이상의 값을 출력하세요");
		}else if(i%2 == 1) {
			System.out.println("홀수");
		}else if(i==0){
			System.out.println("0은 표현하지 않습니다");
		}else {
			System.out.println("짝수");
			
		}
	}	

}
