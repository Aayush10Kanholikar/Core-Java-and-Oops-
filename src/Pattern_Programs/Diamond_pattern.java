package Pattern_Programs;

public class Diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=4;
		for(int i=0; i<number;i++) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			for(int x=i;x<number;x++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i =number-1; i>=0;i--) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
				
			}
			for(int x=i; x<number;x++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
