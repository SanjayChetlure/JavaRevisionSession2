package Constructor;

public class Sample7 
{
	//4: example of multiple constructor -> constructor overloading -> 
	
	int num3;    //8
	int num4;    //9
	String name;      //rahul
	
	//String parameter constructor
	Sample7(String s1)   //rahul
	{
		name=s1;
	}
	
	//int,int parameter constructor
	Sample7(int c, int d)  
	{
		num3=c;
		num4=d;
	}
	
	
	public void studentName()
	{
		System.out.println(name);
	}
	
	
	public void sub()
	{
		System.out.println(num3-num4);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Sample7 s7=new Sample7(8, 9);
		s7.sub();
		
		
		Sample7 s8=new Sample7("rahul");
		s8.studentName();
	}
}
