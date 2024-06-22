package Basic_Concepts;


class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
	
}


class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barking");
	}
}

class BabyDog extends Dog{
	public void sleep() {
		System.out.println("BabyDog is sleeping");
	}
}

public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.sleep();


	}

}
