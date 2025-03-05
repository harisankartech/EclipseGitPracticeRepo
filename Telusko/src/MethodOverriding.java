class P{
	
	public void show() 
	{
		System.out.println("in A");
	}
}
class Q extends P{
	@Override
	 public void show() 
	 {
		 
		super.show();
		System.out.println("in B");
	
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q obj = new Q();
		obj.show();

	}

}
