package Pattern_Programs;

public class Odd_number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		for(int i=number; i>0; i--) {
			if(i%2!=0) {
				for(int j=0, x=i; j<=i; j++,x--) {
					if(x%2==0) {
						System.out.print(j+" ");
					}
				}
				System.out.println();
			}
			
		}

	}

}
