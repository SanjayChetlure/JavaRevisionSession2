package Methods;

public class Sample10 
{
	//method with String parameter
	public static void covertNameToUpperCase(String name)
	{
		System.out.println(name.toUpperCase());
	}
	
	// method with String, int, float, char parameter
	public static void studentInfo(String name,int rollNum, float per, char grade) 
	{
		System.out.println("Name: "+name);
		System.out.println("rollNum: "+rollNum);
		System.out.println("Percentage: "+per);
		System.out.println("grade: "+grade);		
	}

}
