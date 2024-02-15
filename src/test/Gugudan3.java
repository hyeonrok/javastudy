package test;

public class Gugudan3 {

	public static void main(String[] args) {
		
			for(int i=2; i<10; i++) {
				int sum =0;
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				sum += i*j;
			}
			System.out.println("---------------------------------");
			System.out.println("합 "+ sum);
			System.out.println("---------------------------------");
			
		}
	
		
	}

}
