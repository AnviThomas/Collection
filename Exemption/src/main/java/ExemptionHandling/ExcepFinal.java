package ExemptionHandling;

public class ExcepFinal {
public void display()
{
	try
	{
		int a= 3;
		int b= 0;
		int c=a/b;
	}

finally
{
	System.out.println("Exception occured");
}
}
	public static void main(String[] args) {
		ExcepFinal obj=new ExcepFinal();
obj.display();
	}

}
