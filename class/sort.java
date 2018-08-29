import java.util.*;
public class sort
{
	public static void main(String[] args)
	{
		int x[] = new int[]{1,1,1,1,0,0,1,0};
		for(int i = 0;i < 8;i++)
		{
		  for(int j = i + 1;j < 8;j++)
		   {
			if(x[i] > x[j]) 
			{
				int tmp = x[i];
				x[i] = x[j];
				x[j] = tmp;
			}
		   } 
		}
			for(int i = 0;i < 8;i++)
			{
				System.out.print(" "+x[i]);	  	
			}	
	}
}