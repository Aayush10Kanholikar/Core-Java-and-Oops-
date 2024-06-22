package Basic_Concepts;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] age = new int[5];
		
		System.out.println("Length of array: " + age.length);
		
		age[0]= 10;
		age[1]= 11;
		age[2]= 12;
		age[3]=13;
		age[4]=14;
		
//		for(int a:age) {
//			System.out.println(a);
//		}
		
		for(int a=0; a<age.length; a++) {
			System.out.println(age[a]);
			
		}

	}

}
