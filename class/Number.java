import java.util.Scanner;
public class Number
{
	public static void main(String args[])
	{
		String a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("The sum of two string number "+c);
	}
}