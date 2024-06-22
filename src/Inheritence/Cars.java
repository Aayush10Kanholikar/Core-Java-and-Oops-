package Inheritence;

public class Cars extends Vehicle {
	
	String color = "";
	int tyre =0;
	
	
	public Cars(int c, int m, String col, int ty) {
		super(c,m);
		color=col;
		tyre=ty;
	}
	
	
	
	public void show_cars_details() {
		System.out.println("The color of the car is "+color);
		System.out.println("Thr number of the tyre are "+tyre);
	}

}
