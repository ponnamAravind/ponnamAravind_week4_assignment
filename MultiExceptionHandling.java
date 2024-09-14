package task_4;

public class MultiExceptionHandling 
{
		public static void performDivision(int a, int b) throws ArithmeticException
		{
	        int result = a / b; 
	        System.out.println("Division Result: " + result);
	    }

	    
	    public static void checkStringLength(String str) throws NullPointerException {
	        System.out.println("String Length: " + str.length());
	    }

	    
	    public static void validateNumber(int number) throws CustomException 
	    {
	        if (number < 0) 
	        {
	            throw new CustomException("Number cannot be negative.");
	        } else 
	        {
	            System.out.println("Number is valid: " + number);
	        }
       }
	    
	    public static void main(String[] args) throws CustomException 
		 {
			 
			 try {
		            
				 performDivision(10, 0);  // Division by zero
		            
				 checkStringLength(null);  // Passing a null string

				 validateNumber(-2); // Passing a negative number

		        } 
			 catch (ArithmeticException e) 
			 {
		            System.out.println("Caught ArithmeticException: " + e.getMessage());
		     } 
			 catch (NullPointerException e) 
			 {
		            System.out.println("Caught NullPointerException: " + e.getMessage());
		      } 
			 catch (CustomException e)
			 {
		            System.out.println("Caught CustomException: " + e.getMessage());
		     } 
	        finally 
	        {
		          System.out.println("Finally block executed. Cleaning up resources...");
	        }			 
		 }

	 }

class CustomException extends Exception 
{
    public CustomException(String message) {
        super(message);
    }
}
