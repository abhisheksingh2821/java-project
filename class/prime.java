import java.util.Scanner;
public class prime
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
int max=0;
if(a == 1)  max = 1;
if(a != 1)
   {
    int i;
for(int j=2 ;j<a;j++)
{
max=0;
    for (i=2;i<=j/2;i++)
{
    if(j%i==0)
    {
      max=1;
    }
    }
     if(max!=1)
   
    {
System.out.println(j);
      }
    }
  
} 
}
  }
