
abstract class Human{ //Abstract class
	
	public abstract void eat();
		
	
}

class Man extends Human{ //Concrete class
	
	public void eat() {
		
	}
}


public class AbstractKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human obj2 = new Man();
	}

}
