class Employee{
	
	int eid;
	int salary;
	static { // called when loading a class
		String ceo = "Larry";
		System.out.println("in static");
	}
	
	public Employee() {  //called when calling an object
		eid=1;
		salary=12000;
		System.out.println("in constructor");
		System.out.println();
	}
	
	
	
	
}
public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Employee emp1 = new Employee();
		emp1.eid=12;
		emp1.salary=122222;
		
		
		Employee emp2 = new Employee();
		emp2.eid=13;
		emp2.salary=32222;
		
		
	}

}
