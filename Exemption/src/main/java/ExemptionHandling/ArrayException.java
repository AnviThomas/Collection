package ExemptionHandling;

public class ArrayException {
	public void display()
	{
		try {
			int a[] = new int[5];
			a[8]=3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Exception handled");	
			}
		}
	public static void main(String[] args) {
		ArithmetException obj =new ArithmetException();
		obj.display();

	}

}
