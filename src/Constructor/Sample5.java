package Constructor;

public class Sample5
{
	//3: example user defined constructor -> with parameter
	
	int num1;     //7
	int num2;     //8
	
	
	//user defined with 2 int (int,int )parameter constructor 
	Sample5(int a, int b)  //7, 8
	{
		num1=a;      //globalVAriable = local variable
		num2=b;
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
		Sample5 s5=new Sample5(10,20);
		s5.add();
		s5.mult();
		
		System.out.println("----");
		
		Sample5 s6=new Sample5(50, 60);
		s6.add();
		s6.mult();
		
		System.out.println("----");
		
		Sample5 s7=new Sample5(7, 8);
		s7.add();
		s7.mult();
		
		System.out.println("---------------------");
		
		Sample6 s8=new Sample6(80, 85);
		s8.sub();
		
		System.out.println("---");
		
		
		Sample6 s9=new Sample6(200, 70);
		s9.sub();	
	}

}
