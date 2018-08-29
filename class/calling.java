
class Abhi
{
	int x;
	Abhi()
	{
		x=10;
	}
	Abhi(int x)
	{
		this();
	}
	void display()
	{
		System.out.println("value of x is: "+x);
	}
}

public class calling {

	public static void main(String[] args) {
		
Abhi obj=new Abhi(50);
obj.display();
	}

}
