
public class RightTrianglePattern {

	public static void main(String[] args) {
		//combination of a  inverted right triangle of spaces and a triangle of stars
		 
		for(int i=1;i<=10;i++) {
			for(int j=i;j<10;j++) {
				System.out.print("  ");//print a right inverse of spaces
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");//print a left triangle of stars
			}
			System.out.println();
		}
		
		
		
	}
	}
