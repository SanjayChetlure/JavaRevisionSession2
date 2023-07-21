package Constructor;

public class Sample6
{
	int num3;   //200
	int num4;   //70
	
	//user defined constructor with 2 int parameter
	Sample6(int c, int d)  // 200 70
	{
		num3=c;
		num4=d;
	}
	
	
	public void sub()
	{
		System.out.println(num3-num4);
	}

}
