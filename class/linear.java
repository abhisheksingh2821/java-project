import java.util.*;
public class linear
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int flag = 0;
		for(int i =0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
           System.out.println("enter the no.to be searched");
           
          int a = sc.nextInt();
          
          for(int i =0;i<n;i++)
        {
           if (x[i]==a)
           
           {
             flag = 1;
           }
          
        }
        if(flag==1)
             System.out.println("number found");
        else
             System.out.println("number not found");
    }
}