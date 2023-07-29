package ExecptionHandling;

public class example5
{
	
	public static void main(String[] args)
	{		
		String s1="abcd";
						
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception");
		}
		catch(Exception e)		
		{
			e.printStackTrace();
			System.out.println("generic Exception handled");
		}
						
		System.out.println("hi");		
	}
}
