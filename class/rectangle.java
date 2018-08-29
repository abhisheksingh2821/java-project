import java.util.Scanner;
class area
{
  private double length;
  private double breadth;

  public double getLength()
  {
	return length;
  }
  public void setLength(double x)
  {
	length = x;
  }
  public double getBreadth()
  {
	return breadth;
  }
  public void setBreadth(double x)
  {
	breadth = x;
  }
  public void CalculateArea()
  {
	double area = length * breadth;
	System.out.println("The area of rectangle is "+area);
  }
}

public class rectangle
{
  public static void main(String[] args)
  {
	area a = new area();
	Scanner sc = new Scanner(System.in);
	double l = sc.nextDouble();
	double b = sc.nextDouble();
	a.setLength(l);
	a.setBreadth(b);
	a.CalculateArea();
  }

}