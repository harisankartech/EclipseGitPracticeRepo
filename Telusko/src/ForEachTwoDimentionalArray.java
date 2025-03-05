
public class ForEachTwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {
				
				{3,4,5},
				{4,7,5},
				{9,3,5}
				
		};
		
		for(int k[]:a) {
			for(int m:k) {
				System.out.print(" "+m);
			}
			System.out.println();
		}
				
				
		
	}

}
