package Test;

public class Student {
	
	String sname="";
	int smarks=0;
	
	public Student(String name, int marks ) {
		sname=name;
		smarks=marks;
	}
	
	
	public void show_details() {
		System.out.println("Name of the student is "+sname);
		System.out.println("Marks of the student are "+ smarks);
		
	}

	
}
