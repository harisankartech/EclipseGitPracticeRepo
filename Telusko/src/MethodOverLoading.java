class Calculator{
	
	
	public void perform(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void perform(int c,int d,int e) {
		int sum = c+d+e;
		System.out.println(sum);
	}
	
	public void perform(int p,int q,int r,int s) {
		int sum = p+q+r+s;
		System.out.println(sum);
	}
	
	
}
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		
		calc.perform(10,40);
		calc.perform(10,50,50);
	
		calc.perform(10, 20, 30, 40);

	}

}
