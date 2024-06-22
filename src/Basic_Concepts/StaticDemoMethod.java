package Basic_Concepts;



public class StaticDemoMethod {
	public static void staticMethod()
	{
		System.out.println("Static Method");
	}
	public void NormalMethod() {
		System.out.println("Normal Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemoMethod m  = new StaticDemoMethod();
		m.NormalMethod();
		staticMethod();

	}

}
