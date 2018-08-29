import java.util.*;

class base   
{
public void show()
{
System.out.println("base class");
}
}
class derived extends base
{

}
 
public class inherit
{
public static void main(String[] args)
{
    derived d = new derived();
    d.show();
}

}