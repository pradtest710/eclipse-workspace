package customer_tablevalidation;

public class Primenumber {

	public static void main(String[] args) {
		
		
		int number = 17;
		boolean isPrime = true;
	
		
		/*
		 * if(number <1) {
		 * 
		 * isPrime=false; }
		 */
		 
		for (int i = 2; i < number; i++) {
		
			if(number%i==0) //{17 is divide by 2 and not equal to 0- so condition is false}
			{
				isPrime=false;
				break;
			}
			
			
		}
		
		if(isPrime)
		{
			System.out.println("given number is prime");
			
		
		}
		else
		{
			System.out.println("given number is not prime");
		}
	}

}
