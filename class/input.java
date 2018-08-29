import java.util.*;
public class input
{
	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 float b = sc.nextFloat();
		 short c = sc.nextShort();
		 long d = sc.nextLong();
		 double e = sc.nextDouble(); 
 		 String s= sc.next(); //for single word
        sc.next();
 		 String ss = sc.nextLine(); 
        sc.next();
  		 char ch = sc.next().charAt(0); //for a character
                System.out.println(a + b + c + d + e + s + ss + ch);
    }
}