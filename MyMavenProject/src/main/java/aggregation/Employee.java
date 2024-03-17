package aggregation;

public class Employee {
	int id;
	String name;
	Address add;
	
	Employee(int id,String name,Address add)
	{
		this.id=id;
		this.name= name;
		this.add=add;
		
	}
	public void show()
	{
		System.out.println(id+"     "+name);
		System.out.println(add.state+"   "+add.city+"  "+add.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj = new Address("kerala","india","tvm");
		Employee obj2 =new Employee(12,"sree",obj);
		Address e=new Address("kerala","india","kollam");
		Employee e1=new Employee(13,"anu",e);
		e1.show();
		obj2.show();
		
		
		
	}

}
