import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Factorial of a number eg,n=10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();        
		
	    	
			int factorial = 1;
			// factorial = n*(n-1)*(n-1)....
			for(int i =1;i<=n;i++) {
				factorial = factorial*i;
				
				
			}
			System.out.println(factorial);
        
        
	
	}
	
	
		
    

}
