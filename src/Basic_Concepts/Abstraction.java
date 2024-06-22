package Basic_Concepts;



abstract class Demo{
	public void normalMethod() {
		System.out.println("Normal Method");
	}
	abstract void abstractMethod();
}

class Ca extends Demo{
	void abstractMethod() {
		System.out.println("Abstract Method");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ca c  = new Ca();
		c.abstractMethod();
		c.normalMethod();

		

	}

}
