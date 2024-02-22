package ExemptionHandling;

public class NullPoint {
	public void display()
	{
		try {
			String str= null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Exception handled");	
			}
	
	}
	public static void main(String[] args) {
		NumberFormat obj= new NumberFormat();
		obj.display();

	}

}
