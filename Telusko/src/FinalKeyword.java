final class R{
	
	final int i = 10;
	
	public R()
	{
		//i=15; final variable cannot be changed
	}
	 public final void show() {
		
	}
}

class S extends R{   //cannot extends a final class
    public void show() {
		
	}
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
