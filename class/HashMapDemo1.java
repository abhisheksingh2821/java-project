import java.util.*;
class Student
{
	private int id;
	Student()
	{
		this.id = 9999;

	}
	Student(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
		//accessor method or getter method
	}
	public void setId(int id)
	{
		this.id = id;
		//mutator method or setter method as it changes the values 
	}
	public boolean equals(Object o) // overriding equal method
	{	
		
		Student s = (Student) o;
		if(id == s.getId()) return true;
		else return false;
	}
	public int hashCode()  //overriding hashCode method
	{
		return ((id%10)*(id / 10) + 1);
	}
}
public class HashMapDemo1
{
	public static void main(String[] x)
	{
		Map<String,Student> l = new HashMap<>();
		
		char ch[] = {'a','b','c','d','e'};
		
		for(int i=0;i<5;i++)
		{
			l.put(Character.toString(ch[i]),new Student(i*10));
		}
		
		Set s = l.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			
			System.out.println(me.getKey() + " : " + (((Student)me.getValue()).getId()));
		}
	}
}