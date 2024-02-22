package ExemptionHandling;

public class ExcepThrow {
public static void validate(int age)
{
	if (age<18)
	{
		throw new ArithmeticException ("Person is not eligible");
	}
		else
		{
			System.out.println("Person is eligible");
	}
}
	public static void main(String[] args) {
		
		ExcepThrow obj = new ExcepThrow ();
		obj.validate(25);
	}

}
