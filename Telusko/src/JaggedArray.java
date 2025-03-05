
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int d[][]= {
				
				{2,4,5,7,8},
				{5,6,8,13,15},
				{7,9,10}
		};
		
		for(int i=0;i<d.length;i++) {
			
			for(int j=0;j<d[i].length;j++) {
				System.out.print(" " +d[i][j]);
			}
			System.out.println();
		}
		
	}
	
	}

