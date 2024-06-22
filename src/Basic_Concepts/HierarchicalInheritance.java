package Basic_Concepts;


class Animals{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dogs extends Animals{
	void play() {
		System.out.println("Dog is playing");
	}
}

class Cat extends Animals{
	void mew() {
		System.out.println("Mewing"  );
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Cat c = new Cat();
		c.eat();
		c.mew();
		

	}

}
