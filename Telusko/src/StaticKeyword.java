
class Emp {
	
	int eid;
	int salary;
	static String ceo="John";
	
	public void show() {
		System.out.println(eid + ":" +salary+ ":" +ceo);
	}
	
}
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp hari =new Emp();
		hari.eid=10;
		hari.salary=10000;
		
		
		Emp sam = new Emp();
		sam.eid=11;
		sam.salary=11000;
		Emp.ceo="don";
		
		
		
		hari.show();
		sam.show();
	}

}
