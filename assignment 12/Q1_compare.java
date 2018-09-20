import java.util.*;
public class Q1_compare 
{
	public static void main(String args[]) 
	{
		Set<String> s1=new HashSet<String>();
		
		s1.add("sunday");
		
		s1.add("monday");
		
		s1.add("wednesday");
		
		s1.add("thrusday");

		Set<String> s2=new HashSet<String>();

		s2.add("monday");

		s2.add("wednesday");

		s2.add("friday");
				
		System.out.println("Values in set 1 :" +s1);
		
		System.out.println("Values in set 2 :" +s2);

		s1.retainAll(s2);

		System.out.println("common elements are:"+s1);
	}
}