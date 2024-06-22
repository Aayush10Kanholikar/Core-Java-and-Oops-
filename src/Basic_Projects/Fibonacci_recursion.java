package Basic_Projects;
import java.util.*;



class Fibonacci_recursion {
	int fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_recursion f1 = new Fibonacci_recursion();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=s1.nextInt();
		System.out.println("Fibonacci Series");
		for(int i=0;i<x;i++) {
			System.out.print(f1.fibo(i)+" ");
		}

	}

}
