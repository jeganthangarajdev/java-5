
public class MethodAdd {
	static void add()
	{
        int a,b,c;
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);            //without parameter no return type
	}
	static int add1()
	{
		int a,b,c;
        a=10;
        b=20;
        c=a+b;
        return c;                        //without parameter with return type
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int j=add1();
     System.out.println(j);
	}

}
