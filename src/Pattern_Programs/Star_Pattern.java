package Pattern_Programs;

public class Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int temp=number;
		for(int i=0; i<number;i++) {
			for(int j=temp; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			temp=temp-1;
			System.out.println(); 
		}

	}

}
