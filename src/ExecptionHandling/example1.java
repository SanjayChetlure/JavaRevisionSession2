package ExecptionHandling;

public class example1 
{
	
	public static void main(String[] args)
	{
		
		int [] ar= {10, 20, 50, 40};
		
				
		try
		{
			System.out.println(ar[7]);   //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
			
		System.out.println("hello");
			
	}
}
