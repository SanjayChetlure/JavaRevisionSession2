package TypesOfVariable;

public class Sample5 
{
	//3:  non-static global variable 
	
	int c=30;   //non-static global variable
	
	public static void main(String[] args) 
	{
		//1: non-static global variable call from same class
		Sample5 s5=new Sample5();             //1: create object  of same class
		System.out.println(s5.c);             //2: variable call -> objectName.variableName		
	
		//2: non-static global variable call from diff class
		Sample4 s4=new Sample4();        //1: create object  of diff class
		System.out.println(s4.d);		//2: variable call -> diffClassObjectName.variableName			
	}
	
	
	public static void m1() 
	{
		Sample5 s6=new Sample5();            
		System.out.println(s6.c);  		
	}
	
	public void m2() 
	{
		System.out.println(c);
	}

}
