package ExemptionHandling;

public class NumberFormat {
	public void display()
	{
		try {
			String str= "Hello";
			int num= Integer.parseInt(str);
		}
		catch(NumberFormatException e)
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
