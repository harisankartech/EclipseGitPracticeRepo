class Student{
	
	int rollNo;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st= new Student();
		st.setName("Hari");
		st.setRollNo(10);
		System.out.println(st.getName());
		System.out.println(st.getRollNo());
		
	}

}
