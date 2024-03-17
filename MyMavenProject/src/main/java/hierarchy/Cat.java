package hierarchy;

public class Cat extends Animal {
	public void cats()
	{
		System.out.println("animal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj =new Cat();
		obj.cat();
		obj.cats();
Dog obj1 =new Dog();
obj1.dogs();
obj1.cat();

	}

}
