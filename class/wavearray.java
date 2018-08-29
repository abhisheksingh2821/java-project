import java.util.Scanner;

public class wavearray
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);	
	int []a = new int[10];
	for(int i = 0; i < 10; i++)
	{
	 a[i] = sc.nextInt();
	}
	for(int j = 0; j < 10; j += 2)
	{
		int tmp = a[j];
		a[j] = a[j + 1];
		a[j + 1] = tmp;
	}

	for(int i = 0; i < 10; i++)
	{
		System.out.print(a[i]+" ");
	}
	
  }

}