package ExemptionHandling;

public class ExcepCatchMulti {

	public static void main(String[] args) {
		try
		{
		int a=4/0;
	}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception handling");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println(f);
			System.out.println("Exception occured");
		}
		
	}
	
	}

