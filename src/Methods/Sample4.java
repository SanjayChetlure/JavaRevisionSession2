package Methods;

public class Sample4 
{
	//3: non-static method call from same class
	
	public static void main(String[] args)
	{
	// classname objectName=new classname();  //1: create object of same class
	//	objectName.methodname();              //2: method call --> 
		
		Sample4 s4=new Sample4();
		s4.m5();
		s4.m6();
		s4.m6();
		
		//1: Sample4  -> className  -> dataType or objectType
		//2: s4   -> objectName   -> to identify object
		//3: new   -> keyword    -> use to create blank/empty object
		//4: Sample4()  --> className() -> constructor call --> copy all the members of class into object
	}
	
	//non-static regular method
	public void m5() 
	{
		System.out.println("running non-static regular method m5");
	}
	
	//non-static regular method
	public void m6() 
	{
		System.out.println("running non-static regular method m6");
	}

}
