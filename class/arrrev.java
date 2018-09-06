import java.util.*;
public class arrrev
{
	public static void main(String[] args)
	{
		int x[] = new int[5];
		Scanner sc = new Scanner(System.in);
        
		for(int i =0;i<5;i++)
        {
            x[i]=sc.nextInt();
        }
        	for(int i =4;i>=0;i--)
        {
                 System.out.println(x[i]);
            }
    }
}