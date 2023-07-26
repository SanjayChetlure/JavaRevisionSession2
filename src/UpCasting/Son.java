package UpCasting;

public class Son extends father
{
	
	public void bike() 
	{
		System.out.println("bike: shine");
	}
	
//	public void car()    //without override
//	{
//		System.out.println("car: kia");
//	}
	
	public void money()   //override
	{
		System.out.println("money: 50K");
	}
	
	
	public void home()    //override
	{
		System.out.println("home: 3 BHK");
	}

	
}
