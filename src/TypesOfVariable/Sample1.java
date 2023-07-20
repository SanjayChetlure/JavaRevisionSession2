package TypesOfVariable;

public class Sample1 
{
	//1: local & global variable
	
	int c=30;      //global variable
	
	public void m1()
	{
		int a=10;   //local variable
		System.out.println(a);   //10
		System.out.println(c);   //30
	}
	
	public void m2() 
	{
		int b=20;    //local variable
		System.out.println(b);     //20
		//System.out.println(a);
		System.out.println(c);     //30
	}
	
	public static void main(String[] args) {
		
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
		
	}

}
