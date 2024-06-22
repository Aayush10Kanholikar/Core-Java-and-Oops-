package Basic_Concepts;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no.");
		int fno  = sc.nextInt();
		
		System.out.println("Enter Second no.");
		int sno = sc.nextInt();
		
		
		System.out.println("Enter third no.");
		int tno = sc.nextInt();
		
		int sum = fno+sno+tno;
		
		
		
		System.out.println("Sum is : " + sum);
		
		System.out.println("Now Enter Name");
		String name =sc.next();
		
		System.out.println("Hello" + name+ "Your result is "+ sum);

	}

}
