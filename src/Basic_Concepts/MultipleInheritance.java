package Basic_Concepts;



interface printable1{
	void print();
}

interface Showable{
	void show();
}

class A implements printable1, Showable{
	public void print() {
		System.out.println("Print method");
	}
	public void show() {
		System.out.println("Show Method");
	}
}


public class MultipleInheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A();
		a.show();
		a.print();

	}

}
