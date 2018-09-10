import java.util.*;
public class rotate
{
	public static void main(String[] args)
	{
		int x[] = new int[5];
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i =0;i<5;i++)
        {
            x[i]=sc.nextInt();
        }
 for(int i =k;i<5;i++)
        {
         System.out.print(x[i]);
 }
 for(int i =0;i<k;i++)
        {
         System.out.print(x[i]);
 }

    }
}