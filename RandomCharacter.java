import java.util.Random;

public class RandomCharacter 
{
	Random random = new Random();
	
	// Returns lowerCase letters
	public char getRandomLowerCaseLetter()
	{
		char c = (char)(random.nextInt(26) + 'a');
		return c;
	}
	
	
	// Returns UpperCase letters
	public char getRandomUpperCaseLetter()
	{
		char c = (char)(random.nextInt(26) + 'A');
		return c;
	}
	
	// Returns random digit character
	public char getRandomDigitCharacter()
	{
		int i = random.nextInt(10);
		char c = Character.forDigit(i,10);
		return c;
	}
	
	// Returns both lowerCase and UpperCase letters
	 public char getRandomCharacter()
	 {
		 char   c = (char)(random.nextInt(95) + 32);
	     return c;
	 }
	 
	 
	 public boolean isPrime(int n)
	    {
	        // when input <= 1 
	        if (n <= 1)
	            return false;
	  
	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	  
	        return true;
	    }

	    public int getPrime()
	    {
	        int x = random.nextInt(100) + 1;

	        while (!isPrime(x)) {
	            x = random.nextInt(100) + 1;
	        }
	        return x;
	    }

}
