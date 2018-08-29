import java.util.*;
public class arr
{
	public static void main(String[] args)
	{
		int x[] = new int[5];
		Scanner sc = new Scanner(System.in);
        int sum=0,avg;
		for(int i =0;i<5;i++)
        {
            x[i]=sc.nextInt();
        }
        	for(int i =0;i<5;i++)
        {
                sum=(sum + x[i]);
             
          
        }
           avg=sum/5;
        System.out.println(avg);
    }
}