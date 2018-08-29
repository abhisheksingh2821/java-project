import java.util.*;

interface animal 
{
void show();
}

class dog implements animal
{
public void show()
{
System.out.println("dog barks");
}
}

class cat implements animal
{
public void show()
{
System.out.println("cat meaows");
}
}

public class zoo
{
public static void main(String[] args)
{
    animal a = new dog();
    dog d= new dog();
    cat c = new cat();
    a.show();
    d.show();
    c.show();
}

}