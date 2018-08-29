import java.util.Scanner;
public class rev
{
	public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
  int num,rem,rev=0;
  num=a;
  while(a!=0)
  {
    rem=a%10;
    rev=(rev*10)+rem;
    a=a/10;
  }
System.out.println(rev);
}
}