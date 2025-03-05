class Adder{
	
	
	public int sum(int ...i) {
		
		int sum=0;
		for(int k:i) {
			sum +=k;
		}
		return sum;
	}
}
public class Varags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder obj = new Adder();
		System.out.println(obj.sum(5,4,5,6,4,3,5,7));
		
	
	}
}
