import java.util.*;
public class pattern
{

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
int i,space =2*n-2;;
   for( i=0;i<n;i++)
		{
		
		for(int j=0;j<=i;j++)
			{
			System.out.print("*");
			}
       
		
		for(int k=0;k< space ;k++)
        {
			

                	System.out.print(" ");

		}
    for(int l=0;l<=i;l++)
			{
			System.out.print("*");
        
			}
        System.out.println();

              space -= 2  ;	

}
   

}
}