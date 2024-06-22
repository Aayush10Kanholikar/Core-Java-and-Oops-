package Pattern_Programs;

public class Right_Traingle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		for(int i=0; i<number; i++) {
			for(int j=2*(number-i); j>0;j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
