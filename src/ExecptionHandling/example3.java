package ExecptionHandling;

public class example3
{
	
	public static void main(String[] args)
	{		
		String s1="abcd";
						
		try
		{
			System.out.println(s1.charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		
		
		System.out.println("hi");		
	}
}
