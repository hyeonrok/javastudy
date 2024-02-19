package test;

public class Tree2 {

	public static void main(String[] args) {
		String a = "*";
		String b = " ";
		
		int line = 6;
			
			for(int i = 1; i<line; i++) {
				
				for(int j=(line-1)-i; j>0; j--) {
					
					System.out.print(b);
					
				}
				System.out.println(a);
				a +="*";
			}
			
	}

}
