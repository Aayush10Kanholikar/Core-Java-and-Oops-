package Basic_Concepts;



public class MethodDemo {
	public int add(int a , int b) {
		int sum  = a+b;
		return sum;
		
	}
	
	public String printName(String name) {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MethodDemo m = new MethodDemo();
		
		System.out.println(m.add(1, 2));
		System.out.println(m.printName("Aayush"));

	}

}
