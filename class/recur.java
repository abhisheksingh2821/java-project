import java.util.*;
public class recur
{
public static int print (int n)
{
  if(n<1)
      return 0;
    System.out.println(n);
    return print(n-1);
}
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
}

}