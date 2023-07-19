package ControlStatement;

public class example5_switch2 
{
	public static void main(String[] args)
	{
		switch("AA")
		{
		case "CW":   System.out.println("running CW code");
		break;
		
		case "CD":   System.out.println("running CD code");
		break;
		
		case "MS":   System.out.println("running MS code");
		break;
		
		case "MT":   System.out.println("running MT code");
		break;
		
		default: System.out.println("invalid input");
		
		}	
	}
}
