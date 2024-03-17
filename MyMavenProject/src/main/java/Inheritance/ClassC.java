package Inheritance;

public class ClassC extends ClassB {
	public void show2()
	{
		System.out.println("all");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj = new ClassC();
		obj.show();
		obj.show1();
		obj.show2();
	}

}
