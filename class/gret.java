import java.util.Scanner;
public class gret
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();


	if(a>b && a>c)
	{
		System.out.println("a is greatest");
	}
	if(b>a && b>c)
	{
		System.out.println("b is greatest");
	}
	if(c>a && c>b)
	{
	System.out.println("c is greatest");
	}

	if(a==b && b==c)
	{
		System.out.println("all no.s are equal");
	}
	if(a==b && a>c )
	{
		System.out.println("a and b are greatest");
	}
	if(a==c && a>b )
	{
		System.out.println("a and c are greatest");
	}
	if(b==c && b>a )
	{
		System.out.println("b and c are greatest");
	}
}
}