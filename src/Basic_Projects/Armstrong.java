package Basic_Projects;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100, r, sum=0, a=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(a==sum) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
