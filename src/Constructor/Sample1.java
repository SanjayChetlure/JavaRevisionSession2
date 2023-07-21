package Constructor;

public class Sample1 
{
	//1: example of default constructor
	
	
//	use: copy all the members of class into object
	//default constructor --> provided by compiler
//	Sample1()
//	{
//		
//	}
	
	
	public void m1()
	{
		System.out.println("running method m1");
	}
	
	public void m2()
	{
		System.out.println("running method m2");
	}
	
	
	public static void main(String[] args) 
	{
		//default constructor call from same class
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
		
		System.out.println("---");
		
		//default constructor call from same class
		Sample2 s2=new Sample2();
		s2.m3();
		
	}
}
