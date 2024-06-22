package Basic_Projects;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, a=0, n;
		
		System.out.println("Enter a number");
	Scanner s1= new Scanner (System.in);
	n=s1.nextInt();
	for(i=2;i<=n-1;i++) {
		if(n%2==0) {
			a=a+1;
		}
	}
	if(a>0) {
		System.out.println("Number is not a Prime Number");
	}
	else {
		System.out.println("It is a Prime Number");
	}

	}

}
