import java.util.Scanner;
class Principal
{
	private  String p;
	private static Principal l;
	private Principal(String name)
	{
		this.p = name;
	}
	public static Principal getPrincipal(String n)
	{
		if(l == null)
		l = new Principal(n);
		return l;	
	}
	public void display()
	{
		System.out.println("Prncipal name is "+p);
	}
}
class Student
{
	String name;
	Student(String n)
	{
		this.name = n;
	}
	public void display()
	{
		System.out.println("Student name is "+name);
	}
}
public class school
{
	public static void main(String args[])
	{
		Principal pr = Principal.getPrincipal("princi");
		Student s = new Student("xyz");
		Student s1 = new Student("abc");
		s1.display();
		s.display();
		pr.display();
	}
}