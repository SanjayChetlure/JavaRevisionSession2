package ExecptionHandling;

public class example2 
{
	
	public static void main(String[] args)
	{		
		String s1="abcd";
				
		
		try
		{
			System.out.println(s1.charAt(0));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		
		
		System.out.println("hi");
		
		
	}

}
