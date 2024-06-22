package Pattern_Programs;

public class Alphabets_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=5;
		int i= number-1;
		while(i>=0) {
			int alphabets = 65;
			int j=0;
			while(j<=i) {
				System.out.print((char)(alphabets+j)+" ");
				j++;
				
			}
			System.out.println();
			i--;
		}
		i=1;
		while(i<number) {
			int alphabets=65;
			int j=0;
			while(j<=i) {
				System.out.print((char)(alphabets+j)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
