package Methods;

public class Sample9
{
	//6: method with parameter
	
	public static void main(String[] args)
	{
		add(10,20);
		add(50, 60);
		add(100, 200);
		
		System.out.println("----------");
		
		Sample9 s9=new Sample9();
		s9.mult(4, 2);
		s9.mult(6, 9);		
		
		System.out.println("---------------------------");
		
		Sample10.covertNameToUpperCase("amol");
		Sample10.covertNameToUpperCase("kamlesh");
		
		System.out.println("---");
		
		Sample10.studentInfo("Amol", 101, 65.5f, 'A');
	}
		
	
	//method with 2 int (int,int) parameter method
	public static void add(int num1, int num2)     //num1=100,  num2=200      //variable declaration
	{
		System.out.println(num1+num2);
	}
	
	//method with 2 int (int,int) parameter method
	public void mult(int a, int b)     //a=4, b=2
	{
		System.out.println(a*b);
	}

	
	
	
//	//without parameter
//	public static void add() 
//	{
//		int num1=100;
//		int num2=200;
//		System.out.println(num1+num2);
//	}

}
