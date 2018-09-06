import java.util.*;
public class twod
{
    public static int[][] sum(int a[][],int b[][],int n, int m)
    {
        int sum[][]= new int [n][m];
        for (int i=0;i<n;i++)
        {
             for (int j=0;j<m;j++)
             {
               sum[i][j] =   a[i][j] +  b[i][j];
             }
            
        }
        return sum;
    }
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a[] = new int[n][m];
         int b[][] = new int[n][m];
      
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<m;j++)
             
         {
             a[i][j] = sc.nextInt();
             b[i][j] = sc.nextInt();
         }
         
    
        }
      
        int c[][] = sum(a,b,n,m);
    
           System.out.println("sum of array is :");
          for(int i=0;i<n;i++)
        {
         for(int j=0;j<m;j++)
             
         {
             System.out.print(c[i][j]);
             
         }
          }
    }
}