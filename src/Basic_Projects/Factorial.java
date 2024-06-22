

package Basic_Projects;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f=1, i, n;
		System.out.println("Enter a Number");
		Scanner s1 = new Scanner(System.in);
		n= s1.nextInt();
		for(i=1; i<=n; i++) {
			f=f*i;
		}
		System.out.println("The Factorial of a number "+n+" is " +f);
		

	}

}
