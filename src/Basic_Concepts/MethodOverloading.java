package Basic_Concepts;


public class MethodOverloading {
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.add(1, 2);
		m.add(1, 0, 0);

	}

}
