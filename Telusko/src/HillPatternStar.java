
public class HillPatternStar {

	public static void main(String[] args) {
		//combination of a decreasing triangle of spaces,increasing triangle of stars and a increasing triangle of stars

		for(int i=1;i<=10;i++)
		{
			for(int j=i;j<=10;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* " );
			}
			System.out.println();
		}
		
	}

}
