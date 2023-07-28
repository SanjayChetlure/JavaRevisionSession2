package StringClassMethods;

public class Sample1 
{
	public static void main(String[] args) 
	{
		
	//only declaration
	String s1;	
	
	
	//declaration & initialization
	String s2="abcd";
		
		
	//----------------------------------
	
	
	String s5="ab";
	
	//re-initialization
	s5=s5+"cd";   //ab +  cd  = abcd
	
	s5=s5+"xyz";    //abcd + xyz = abcdxyz
	
	
	//---------------------------------------
	
	//Object creation of String:
	
	//1: without using new keyword
	String s11="xyz";
	
	//2: using new keyword
	String s12=new String("xyz");
	
	
	
	//----------------------------------------------
	
	//without new keyword
	String s15="abc";
	String s16="abc";
	String s17="abc1";
	
	//new keyword
	
	String s21=new String("abc");
	String s22=new String("abc");
		
	}

}
