package Basic_Concepts;



interface Printable{
	void print();
}

class Trinagle implements Printable{
	public void print() {
		System.out.println("Printable Traingle");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trinagle t = new Trinagle();
		t.print();

	}

}
