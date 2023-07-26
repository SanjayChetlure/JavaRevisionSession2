package Interface_ImplementationClass;

//sub class or IC

public class Sample implements I1, I2
{
	public void m1() 
	{
		System.out.println("m1 from I1 completed IC");
	}
	
	public void m2() 
	{
		System.out.println("m2 from I1 completed IC");
	}
	
	public void m3() 
	{
		System.out.println("m3 from I2 completed IC");
	}
	
	public void m4() 
	{
		System.out.println("m4 from I2 completed IC");
	}

	
}
