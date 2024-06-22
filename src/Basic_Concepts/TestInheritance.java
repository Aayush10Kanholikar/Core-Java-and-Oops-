package Basic_Concepts;



class Parent {
	public void walk() {
		System.out.println("Parent class method");
	}
	
}

class Child extends Parent{
	public void run() {
		System.out.println("Child class method");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p  = new Parent();
		p.walk();
		
		Child c = new Child();
		c.run();
		c.walk();

	}

}
