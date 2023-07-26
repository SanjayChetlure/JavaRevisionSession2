package Abstract_Concrete_class;

//abstract or incomplete class
abstract public class Sample1
{
	//complete method
	public void m1()    //declaration
	{
		System.out.println(" method m1 completed in abstract class");       //definitation
	}
	
	//complete method
	public void m2()    
	{
		System.out.println(" method m2 completed in abstract class");     
	}
	
	//incomplete method
	abstract public void m3();   //declaration
	
	
	//incomplete method
	abstract public void m4();   //declaration
}
