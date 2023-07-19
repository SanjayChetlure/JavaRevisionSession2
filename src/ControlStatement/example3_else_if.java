package ControlStatement;

public class example3_else_if
{
	public static void main(String[] args) 
	{
		int marks=22;
		
		//22>=65
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		//       22>=60   &  62<=64
		else if(marks>=60 & marks<=64)       //60 to 64  
		{
			System.out.println("1st class");
		}
		//    22>=50    & 55<=59
		else if(marks>=50 & marks<=59)          //50 to 59
		{
			System.out.println("2nd class");
		}
		//      22>=35  & 45<=49
		else if(marks>=35 & marks<=49)
		{
			System.out.println("pass");
		}
		// 22<35
		else if(marks<35)
		{
			System.out.println("fail");
		}
	}
}
