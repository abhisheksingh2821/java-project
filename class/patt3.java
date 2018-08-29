public class patt3
{
	public static void main(String args[])
	{
	for(int i=1;i<=5;i++)
		{ if(i%2==0)
continue;
		for(int j=5;j>=i;j--)
			{
			System.out.print(" ");
			}
			
		for(int k=1;k<=2*i-1;k++)
			{
			System.out.print("*");
			}

                	System.out.println();
		}
	
}
