
public class MyClass
{
	static int a=3,b=3,z;
	static void Add()
	{
		int z=a+b;
		System.out.println("Add :" +z);
	}
	static void Sub()
	{
		z=a-b;
		System.out.println("Sub :"+z);
	}
	static void mul()
	{
		int z=a*b;
		System.out.println("mul :" +z);
	}
	static void div()
	{
		z=a/b;
		System.out.println("div :"+z);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       MyClass obj1=new MyClass();
       MyClass obj2=new MyClass();
       MyClass obj3=new MyClass();
       MyClass obj4=new MyClass();
       obj1.Add();
       obj2.Sub();
       obj1.mul();
       obj2.div();
	}

}
