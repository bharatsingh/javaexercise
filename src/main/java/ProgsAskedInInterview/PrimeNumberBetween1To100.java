package ProgsAskedInInterview;

public class PrimeNumberBetween1To100 {

	public static void main(String[] args) {
		isPrime(27);
		
	}

	public static void isPrime (int num) {
		boolean isPrime=true;

		for(int i=2;i<num;i++)
		{
		   if(num%i==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println("Prime Number");
		else
		   System.out.println("not Prime Number");
	   }
	}