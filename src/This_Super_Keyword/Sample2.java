package This_Super_Keyword;

public class Sample2 extends Sample1
{
	
	//int a=10;   //global variable from super class 
	
	int a=20;   //global variabe from same class
	
	public void m1()
	{
		int a=30;
		System.out.println(a);       //print local variable
		System.out.println(this.a);  //print global variable from same class
		System.out.println(super.a); //print global variable from super class
	}
	
	
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		s2.m1();		
	}
}
