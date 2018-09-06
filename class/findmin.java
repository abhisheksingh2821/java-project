import java.util.*;
public class findmin
{
    
   public static int findmin(int[]x,int n)
    {
        int min =x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]< min)
            {
                min = x[i];
                
            }
            
        }
       return min;
    }
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
		for(int i =0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
         
        int a= findmin(x,n);
        System.out.println(a);
    }

}
