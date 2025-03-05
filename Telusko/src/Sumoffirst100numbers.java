import java.util.Scanner;

public class Sumoffirst100numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Factorial of a number eg,n=10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();        
		
	    	
			int sum = 0;
			int i = 1;
			// factorial = n*(n-1)*(n-1)....
			do {
				sum = sum+i;
				i++;
			}while(i<=100);
			System.out.println(sum);
        
        
	
	}
	
	
		
    

}
