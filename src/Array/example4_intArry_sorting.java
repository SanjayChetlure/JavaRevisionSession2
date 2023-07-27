package Array;

import java.util.Arrays;

public class example4_intArry_sorting
{
	public static void main(String[] args) {
		
		
		int [] ar=new int[4];
				
		ar[0]=40;     //10
		ar[1]=10;     //20
		ar[2]=30;     //30
		ar[3]=20;     //40
		
		System.out.println("---original data-----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
		
		
		Arrays.sort(ar);    //[10, 20 ,30 ,40]
		System.out.println("---ascending order-----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
		
		
		System.out.println("---descending order-----");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}	
		
	}
}
