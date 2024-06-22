package Basic_Projects;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,n, reverse=0,a;
		System.out.println("Enter a number");
		Scanner s1 = new Scanner(System.in);
		n=s1.nextInt();
		a=n;
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		if(a==reverse) {
			System.out.println("It is a Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
