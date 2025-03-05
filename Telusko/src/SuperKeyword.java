class A{
	
	public A() {
		
		System.out.println("in a");
		
	}
	
	public A(int i) {
		System.out.println("in a int");
	}
	
}
class B extends A{
	
public B() {
		
	super(5);//if this is called,parameterised of parent will be called along with non para of sub class
		System.out.println("in b");
		
	}
	
	public B(int i) {
		//super(i);//super is by default for all methods in subclass,giving parameter calls parameterized of superclass
		System.out.println("in b int");
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B obj = new B();
     
		
	}

}
