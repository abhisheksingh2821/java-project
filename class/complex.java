import java.util.Scanner;
class find
{
  private int real;
  private int imaginary;

  public int getReal()
  {
	return real;
  }
  public void setReal(int x)
  {
	real = x;
  }
  public int getImaginary()
  {
	return imaginary;
  }
  public void setImaginary(int x)
  {
	imag = x;
  }
  public void Display()
  {

	System.out.println("The complex no  is "+real+" + "+imag+"i");
  }
}

public class complex
{
  public static void main(String[] args)
  {
	find a = new find();
	Scanner sc = new Scanner(System.in);
	int real = sc.nextInt();
	int imaginary = sc.nextInt();
	a.setReal(real);
	a.setImag(imaginary);
	a.Display();
  }

}
