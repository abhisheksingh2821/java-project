import java.util.*;
public class kth
{
	public static void main(String[] args)
	{
    Scanner sc = new Scanner(System.in);
          System.out.println("enter the size of the array");
      int n = sc.nextInt();
		int x[] = new int[n];
		
                   System.out.println("enter  the array");  
		for(int i =0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
    
       for(int i = 0;i < n;i++)
		{
		  for(int j = i + 1;j < n;j++)
		   {
			if(x[i] < x[j]) 
			{
				int tmp = x[i];
				x[i] = x[j];
				x[j] = tmp;
			}
		   } 
           
       
    }
        	int j = 0;
		for(int i = 0; i < n - 1; i++)
		{
			if(x[i] != x[i + 1])
				x[j++] = x[i];
		}
		x[j++] = x[n - 1];
        System.out.println("enter the kth position");
         int k = sc.nextInt();
    
        System.out.println(x[k-1]);
}
    
}