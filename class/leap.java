import java.util.Scanner;
class leap
{
	public static void main(String args[])
	{
	int a;
	Scanner sc= new Scanner (System.in);
	a=sc.nextInt();
	if(((a%4==0) && (a%100!=0))||(a%400==0))
   { 
	System.out.print(a+" leap year");
   }
   else
   { 
System.out.print(a+" is not leap year");	
	}
}
}