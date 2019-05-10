import java.util.*;
public class shift
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,0,3,0,2,0,5,0,4};
        
      
        int i=0,j=0;
        while(i<a.length)
        {
        if(a[i] != 0)
        {
            a[j]=a[i];
            j++;
        }
        i++;
    }
        for( i=j;i<a.length;i++)
        {
            a[i]=0;
        }
          for( i=0;i<a.length;i++)
        {
              System.out.println (a[i]);
              
            
          }
    }
}