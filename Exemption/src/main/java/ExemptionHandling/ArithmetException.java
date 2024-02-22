package ExemptionHandling;

public class ArithmetException {
public void display()
{
	try {
		int a=5/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		{
			
		System.out.println("Exception handled");
		}
	}
}
	public static void main(String args[] ) {
		
		ArithmetException obj =new ArithmetException();
		obj.display();
		
	}

}
