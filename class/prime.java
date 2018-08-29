import java.util.Scanner;
public class prime
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
    int i,max = 0;
if(a == 1)  max = 1;
if(a != 1)
{  
  for (i=2;i<=a/2;i++)
{
    if(a%i==0)
    {
      max=1;
    }
   
}
}
 if(max!=1)
   
    {
System.out.println("Prime");
      }
else System.out.println("NOT Prime");

}
  }
