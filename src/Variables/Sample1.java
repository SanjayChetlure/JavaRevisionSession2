package Variables;

public class Sample1
{
	public static void main(String[] args) 
	{
		//1. Variable declaration (Allocating/Reserving memory)
		String sname;       //datatype  variablename
		int srollnum;
		float sper;
		char sgrade;
		
		//2. Variable Initialization(Assigning or Inserting value)
		sname = "Amol";            //variablename = "variable value"
		srollnum = 101;
		sper=65.5f;
		sgrade='A';
		
		//3: Variable usage  (print variable info)
		System.out.println(sname);
		System.out.println(srollnum);
		System.out.println(sper);
		System.out.println(sgrade);
		System.out.println(sname);      //info reuse
		System.out.println(sname);
	}
}
