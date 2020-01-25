
public class Parameter
{
	static void add(int x,int y )
	{
		int z=x+y;
		System.out.println(z);      //with parameter no return type
	}
	static int add1(int x,int y)
	{
		int z=x+y;
		return z;                     //with parameter with return type
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      int j=add1(7,3);
      System.out.println(j);
	}

}
