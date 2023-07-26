
package PolyMorphism;

public class TestOverriding 
{
	public static void main(String[] args) 
	{		
		father f=new father();
		f.car();
		f.money();
		f.home();
						
		Son s=new Son();
		s.car();
		s.money();
		s.home();			
	}
}
