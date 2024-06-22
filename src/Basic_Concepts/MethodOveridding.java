package Basic_Concepts;



class Vehicle{
	void color() {
		System.out.println("Color is black");
	}
	
	void speed() {
		System.out.println("Vehicle is in speed");
	}
}
class Car extends Vehicle{
	void color() {
		System.out.println("Colos is blue");
	}
}

public class MethodOveridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.color();
		c.speed();
		
		Vehicle v =new Vehicle();
		v.color();

	}

}
