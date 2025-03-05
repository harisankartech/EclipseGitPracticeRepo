
class Outer{
	
	int i;
	public void show() {
		
	}
	//class Inner{    --->  //Outer$Inner.class
		static class Inner{    //class can be made static
		
		public void display() {
			System.out.println("In Display");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj2 = new Outer.Inner();//use outer class for inner class reference and outer class object for inner class object....Outer class used for static class
		obj2.display();
	}

}
