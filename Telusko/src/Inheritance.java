

class CalcX{
	
	public int sum(int i,int j) {
		
		return i+j;
		
	}
}
	
class AdvCalcX extends CalcX{
		
	public int diff(int i,int j) {
			return i-j;
		}
	
	
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvCalcX obj2 = new AdvCalcX();
		int result1 = obj2.sum(5, 6);
		int result2 =obj2.diff(5, 7);
		System.out.println(result1);
		System.out.println(result2);
	}

}
