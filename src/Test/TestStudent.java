package Test;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String my_name= scan.nextLine();
		
		System.out.println("Enter Your Marks: ");
		int my_marks = scan.nextInt();
		
		Student myobj = new Student(my_name,my_marks);
		myobj.show_details();
		

	}

}
