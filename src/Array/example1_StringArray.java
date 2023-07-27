package Array;

public class example1_StringArray 
{	
	public static void main(String[] args)
	{
		//step1: array declaration
		String []  ar=new String[5];
		
		
		//step2: array initialization
		ar[0]="rahul";
		ar[1]="mahesh";
		ar[2]="suresh";
		ar[3]="ramesh";
		ar[4]="rahul";
		//ar[5]="sddw";
		
		
		//step3: array usage
		System.out.println(ar[0]);
		System.out.println(ar.length);
		
		System.out.println("-------print all data-----");
		
		
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
