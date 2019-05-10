import java.util.*;
public class merge
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,3,5,7,9,11};
        int a1[] = new int[] {2,4,6,8,10,12,13,14,15,16};
        
        int n = a.length + a1.length ;
        
        int a2[] = new int[n];
        
        int i=0,j=0,k=0;
        
        while(i < a.length && j< a1.length)
        {
            if(a[i]<= a1[j])
            {
                a2[k++]= a[i++];
            }
            else
            {
                a2[k++] = a1[j++];
            }
        }
        while (j< a1.length)
        {
            a2[k++] = a1[j++];
        }
          while (i< a.length)
        {
            a[k++] = a[j++];
        }
        for(int l=0;l<a2.length ;l++)
        {
            System.out.println(a2[l]);
        }
    }
}