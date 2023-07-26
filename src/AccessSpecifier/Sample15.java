package AccessSpecifier;

public class Sample15 
{
	protected int c;    //protected Access specifier
	
	
	protected Sample15()          //protected Access specifier
	{
		c=30;
	}
	
	protected void m3()             //protected Access specifier
	{
		System.out.println(c);
	}
	 
	 
	 public static void main(String[] args)
	 {
		Sample15 s5=new Sample15();
		s5.m3();
		System.out.println(s5.c);	 
	}
}
