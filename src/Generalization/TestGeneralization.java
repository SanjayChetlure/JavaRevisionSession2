package Generalization;

public class TestGeneralization 
{
	public static void main(String[] args)
	{
		System.out.println("--features of Idea simcard---");
		Idea i=new Idea();
		i.sms();
		i.ac();
		i.data();
		i.newFeatureA();
				
		System.out.println("--features of Jio simcard---");
		Jio j=new Jio();
		j.sms();
		j.ac();
		j.data();
		j.newFeatureB();
				
		System.out.println("--features of Airtel simcard---");
		Airtel a=new Airtel();
		a.sms();
		a.ac();
		a.data();	
	}
}
