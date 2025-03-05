class Animal{
	public void show() {
		
		System.out.println("in A");
	}

}

class Dog extends Animal{
	public void show() {
		System.out.println("in B");
	}
}

class Cat extends Animal{
	public void show() {
		System.out.println("in C");
	}
}
public class RunTImePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj = new Dog();//---->Runtime polymorphism
		obj.show();//Dynamic Method Dispatch
		Animal obj2 = new Cat();
		obj2.show();
		
	}

}
