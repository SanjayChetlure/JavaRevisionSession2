package Constructor;

public class Sample3
{
	//2: example user defined constructor -> without/zero parameter
	
	int num1;     //10
	int num2;     //20
	
	
	//user defined constructor --> provided by user
	//use1:  to initialize global variable
	//use2: copy all the members of class into object
	Sample3()
	{
		num1=10;
		num2=20;
	}
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	
	public static void main(String[] args) 
	{
		//user defined constructor call from same class
		Sample3 s3=new Sample3();
		s3.add();
		s3.mult();
		
		
		
		
		System.out.println("---------");
		
		//user defined constructor call from same class
		Sample4 s4=new Sample4();
		s4.sub();
		
	}

}
