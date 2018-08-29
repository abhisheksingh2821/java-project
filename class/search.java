import java.util.*;
public class search
{
	public static void main(String[] args)
	{
		int f = -1;
		int x[] = new int[]{1,4,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < 7;i++)
		{
			if(n == x[i])
			{
				System.out.print("Element Found"); 
				f = 1;
				break;
			}
		}
		if(f == -1) System.out.print("Element NOT Found");  
	}
}