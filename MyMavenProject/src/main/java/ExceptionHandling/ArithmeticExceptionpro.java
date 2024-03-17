package ExceptionHandling;

public class ArithmeticExceptionpro {
	public void show()
	{
		 try
		 {
			 int a=1/0;
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }
		 System.out.println("exception handled");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExceptionpro obj=new ArithmeticExceptionpro();
				obj.show();
	}

}
