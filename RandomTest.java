import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomTest 
{
    static RandomCharacter random;


	@BeforeAll
	public static void setUp()
	{
		random = new RandomCharacter();
	}

	 @Test
	 void getRandomLowerCaseLetter()
	 {
	    char check = random.getRandomLowerCaseLetter();
	    assertTrue(Character.isLowerCase(check));
	 }
	 
	 
	 @Test
	 void getRandomUpperCaseLetter()
	 {
	    char check = random.getRandomUpperCaseLetter();
	    assertTrue(Character.isUpperCase(check));
	  }
	 
	 
	 @Test
	 void getRandomDigit()
	 {
	    char check = random.getRandomDigitCharacter();
	    assertTrue(Character.isDigit(check));
	 }
	 
	 
	 @Test
	 void getPrime()
	 {
	     System.out.println("Generating and checking if it is prime number");

		 int output = random.getPrime();
	     System.out.println("Generated number: " + output );

	        boolean flag = false;
	        for (int i = 2; i <= output/2 ; ++i)
	        {

	            if (output % i == 0) 
	            {
	                flag = true;
	                break;
	            }
	        }
	        assertTrue(!flag);
	 }


	 @Test
	 void getRandomCharacter()
	 {
	    char check = random.getRandomCharacter();
	 }

}
