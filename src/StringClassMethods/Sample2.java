package StringClassMethods;

public class Sample2
{
	public static void main(String[] args) 
	{		
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is abc";
		String s5="abcabab";
		String s6="    xyz";
		
		
		System.out.println(s6);
		System.out.println(s6.trim());
		
		
		System.out.println(s1.isEmpty());   //

		System.out.println(s4.replace("abc", "xyz"));
		
		System.out.println(s2.concat(s3));
		System.out.println(s2+s3);
		
		System.out.println(s1.substring(2, 5)); //2-4
		System.out.println(s1.substring(6));
		
		System.out.println(s5.lastIndexOf('a'));
		System.out.println(s5.indexOf('b'));   //1
		
		System.out.println(s1.charAt(3));    //v
		
		System.out.println("-------------------");
		
		System.out.println(s1.length());   // 8
		
//		s1=s1.toUpperCase();
//		System.out.println(s1);
		System.out.println(s1.toUpperCase());   //VELOCITY
				
//		s2=s2.toLowerCase();
//		System.out.println(s2);
		System.out.println(s2.toLowerCase());
		
		
		System.out.println(s2.equals(s3));  //false
		System.out.println(s2.equalsIgnoreCase(s3));   //true
		System.out.println(s4.contains("abc"));
		System.out.println("--");
		System.out.println(s4.startsWith("my"));
		System.out.println(s4.endsWith("abc"));
		
		
		
	
	}
}
