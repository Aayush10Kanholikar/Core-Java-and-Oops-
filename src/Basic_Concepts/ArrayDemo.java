package Basic_Concepts;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] [] arr = new int[3][2];
		System.out.println("Number of rows : "+ arr.length);
		System.out.println("Number of columns : "+ arr[0].length);
		
		arr[0][0] = 15;
		arr[0][1]=16;
		
		arr[1][0]=30;
		arr[1][1]=35;
		
		arr[2][0]= 37;
		arr[2][1]=38;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
