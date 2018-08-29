import java.util.*;
public class sec
{
	public static void main(String[] args)
	{
		int x[] = new int[10];
		Scanner sc = new Scanner(System.in);
    
		for(int i =0;i<10;i++)
        {
            x[i]=sc.nextInt();
        }
       for(int i = 0;i < 10;i++)
		{
		  for(int j = i + 1;j < 10;j++)
		   {
			if(x[i] > x[j]) 
			{
				int tmp = x[i];
				x[i] = x[j];
				x[j] = tmp;
			}
		   } 
           
       
    } System.out.println(x[8]);
}
    
}