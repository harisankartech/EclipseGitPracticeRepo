
public class RightSidedDecreasingTriangle {

	public static void main(String[] args) {
		//combination of a left triangle of spaces with inverse right decreasing triangle
		for(int i=1;i<=10;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=10;j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		
	}

}
