package AccessSpecifier;

public class Sample11 
{
	int b;    //default Access specifier
	
	
	Sample11()          //default Access specifier
	{
		b=20;
	}
	
	 void m2()             //default Access specifier
	{
		System.out.println(b);
	}
	 
	 
	 public static void main(String[] args)
	 {
		Sample11 s5=new Sample11();
		s5.m2();
		System.out.println(s5.b);	 
	}
}
