package Pattern_Programs;

public class Inverse_pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =6;
		for(int i=1;i<=number;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int x=1; x<number-i;x++) {
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
