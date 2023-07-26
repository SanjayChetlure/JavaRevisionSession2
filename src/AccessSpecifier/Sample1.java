package AccessSpecifier;

public class Sample1 
{
	private int a;
	
	private Sample1()
	{
		a=10;
	}
		
	private void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		s1.m1();
		System.out.println(s1.a);
		
	}
}
