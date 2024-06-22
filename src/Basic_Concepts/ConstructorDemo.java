package Basic_Concepts;



public class ConstructorDemo {
	int id;
	String name;
	String city;
	
	
	
	
	public ConstructorDemo(int i, String n, String c) {
		this.id=i;
		name=n;
		city=c;
	}
	
	void printData() {
		System.out.println(id+" "+name+" "+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo c = new ConstructorDemo(1, "Aayush", "Kyn");
		
		c.printData();
//		c.test();

	}

}
