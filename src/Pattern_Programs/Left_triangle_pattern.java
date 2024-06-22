package Pattern_Programs;

public class Left_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		for(int i=1; i<=number;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
