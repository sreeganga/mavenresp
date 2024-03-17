package ExceptionHandling;

public class Finallypro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=10/0;
	
}
catch(ArithmeticException e)
{
System.out.println(e);	
}
finally
{
	System.out.println("finally block excuted");
}
	}
}
