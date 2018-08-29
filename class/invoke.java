class Abhi
{
	int x=10;
	void display()
	{
		System.out.println("value of x is: "+x);
	}
}
class Abhishek extends Abhi
{
	
	void display()
	{
		System.out.println("Assignment6");
	}
	void show()
	{
	super.display();
	}
}
public class invoke {

	public static void main(String[] args) {
		Abhishek obj=new Abhishek();
		obj.show();

	}

}