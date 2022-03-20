
public class RandomMainProgram 
{

	    public static  final int MaxValue = 15;
	    
	    public static void main(String[] args)
	    {
	        RandomCharacter r = new RandomCharacter();


	        //function 1 get Random lowerCase
	        System.out.println("1) Print Random Lower Case Characters");

	        for(int i = 0; i < MaxValue; i++)
	        {
	            System.out.print(r.getRandomLowerCaseLetter());
	        };

	        //function 2 get Random Upper Case
	        System.out.println("\n2) Print Random Upper Case Characters");

	        for(int i = 0; i < MaxValue; i++)
	        {
	            System.out.print(r.getRandomUpperCaseLetter());
	        };


	        //function 3 get Random Digits
	        System.out.println("\n3) Print Random Digit Characters");
	        for(int i = 0; i < MaxValue; i++)
	        {
	            System.out.print(r.getRandomDigitCharacter());
	        };
	        

	        //function 4 get Random Character
	        System.out.println("\n4) Print Random Characters" );
	        for(int i = 0; i < MaxValue; i++)
	        {
	            System.out.print(r.getRandomCharacter());
	        };
	        
	    }
}
