package Basic_Concepts;



abstract class Shape{
	abstract void area();
}

class Circle extends Shape{
	void area() {
		System.out.println("Area");
	}
}


public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c= new Circle();
		c.area();


	}

}
