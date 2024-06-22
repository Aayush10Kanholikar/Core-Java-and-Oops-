package Pattern_Programs;

public class Binary_number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				if(j%2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
				
			}
			System.out.println();
		}

	}

}
