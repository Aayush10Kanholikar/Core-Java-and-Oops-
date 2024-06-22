package Inheritence;
import java.util.Scanner;

public class TestInheritence {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter cost of the vehicle: ");
		int vehicle_cost = scan.nextInt();
		
		System.out.println("Enter mileage of the vehicle: ");
		int vehicle_mileage=scan.nextInt();
		
		System.out.println("Enter color of the car: ");
		String car_color=scan.next();
		
		System.out.println("Enter Numebr of tyres in the car: ");
		int car_tyre=scan.nextInt();
		
		
		Cars obj = new Cars(vehicle_cost, vehicle_mileage,car_color,car_tyre );
		
		
		obj.show_cars_details();
		obj.show_vehicle_details();
				
	}

}
