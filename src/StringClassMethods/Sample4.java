package StringClassMethods;

public class Sample4 
{
	public static void main(String[] args)
	{
		
		String s1="abcd";
		System.out.println(s1);
		
		
		s1=s1.substring(0,1).toUpperCase() + s1.substring(1);
		System.out.println(s1);
		
	}

}
