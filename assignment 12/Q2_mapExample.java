import java.util.*;

public class Q2_mapExample 
{
	public static void main(String args[]) 
	{
	HashMap<Integer,String> hm=new HashMap<>();

	hm.put(2218,"IND");

	hm.put(8122,"USA");

	hm.put(4037,"CHN");

	hm.put(3740,"SL");

	hm.put(4730,"AUS");
	
	Iterator i=hm.entrySet().iterator();
	
		while(i.hasNext()) 
		{
		Map.Entry me=(Map.Entry)i.next();
	
		System.out.print(me.getKey()+":");
	
		System.out.print(me.getValue()+"\n");
		}
	}
}