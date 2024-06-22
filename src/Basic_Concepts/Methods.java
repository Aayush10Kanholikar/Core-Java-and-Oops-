package Basic_Concepts;



public class Methods {
	
	public static void add()
	{
		int a = 10;
		int b = 20;
		System.out.println("Sum is:" + (a+b));
	}
	
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is :" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Methods m = new Methods();
		add();
		m.add(10, 20);

	}

}
