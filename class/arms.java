import java.util.Scanner;
import java.lang.Math;
public class arms
{
	public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
  int count=0,x,y,sum=0;
  x=a;
  y=x;
  while(a!=0)
  {
  a=a/10;
      count++;}
  while(x!=0)
  {
    
    sum= sum + (int)Math.pow(x%10,count);
    x=x/10;
  }
  
   if(sum==y)
  {
	System.out.println("ARMSTRONG");
	}
  else
  {
   
    System.out.println("NOT ARMSTRONG");
  }
}
}