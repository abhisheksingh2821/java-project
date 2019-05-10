import java.io.*;


public class exists
{
	public static void main(String args[])
	{ 
      
        
        File f = new File("G:/xyz.txt");
        if (!(f.exists()))
{
try
{
f.createNewFile();
System.out.println("file creaetd");

}
catch(IOException e)
{
System.out.println(e);
}
}
    }
}