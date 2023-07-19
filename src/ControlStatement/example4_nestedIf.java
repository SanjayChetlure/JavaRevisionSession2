package ControlStatement;

public class example4_nestedIf
{
	public static void main(String[] args) 
	{		
		int PEM=100;
		int MEM=0;
		
		// 100>=300
		if(PEM>=300)        //outer if
		{
			System.out.println("eligible for mains exam");
			//600>=800
			if(MEM>=800)        //inner or nested if
			{
				System.out.println("got selected");
			}
			else
			{
				System.out.println("rejected from mains exam: MEM<800");
			}		
		}
		else
		{
			System.out.println("not eligible for mains exam: PEM<300");
		}	
	}
}
