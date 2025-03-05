class Calc1 {
	int num1;
	int num2;
	int sum;
	
	public Calc1() {
		num1=5;
		num2=8;
	}
	public Calc1(int i) {
		num1=i;
		
	}
	public Calc1(int k,float j){
		num1=k;
		num2=(int) j;
		
	}
	public void add() {
		// TODO Auto-generated method stub
		sum = num1+num2;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc1 obj = new Calc1(4,5.5f);
		obj.add();
		System.out.println(obj.sum);
	}

}
