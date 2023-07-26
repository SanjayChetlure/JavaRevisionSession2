package UpCasting;
public class TestUpCasting
{
	public static void main(String[] args) {
		
		//create an object of sub class with reference/dataType of super class
		father f=new Son();   
		f.car();
		f.money();
		f.home();
		//f.bike();	
	
	}
}
