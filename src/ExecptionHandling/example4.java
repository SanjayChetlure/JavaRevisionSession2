package ExecptionHandling;

public class example4
{
	
	public static void main(String[] args)
	{		
		String s1="abcd";
						
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("generic Exception handled");
		}
		
				
		System.out.println("hi");		
	}
}
