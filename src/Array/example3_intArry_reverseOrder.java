package Array;

public class example3_intArry_reverseOrder
{
	public static void main(String[] args) {
				
		int [] ar=new int[4];
				
		ar[0]=40;
		ar[1]=10;
		ar[2]=30;
		ar[3]=20;
				
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}	
	}
}
