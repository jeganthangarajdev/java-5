import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
	int m;
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	System.out.println("enter month");
	if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
	{
		System.out.println("31 days");
	}
	else if(m==2)
	{
		System.out.println("28 days");
	}
	else
	{
		System.out.println("30 days");
	}
	
	
	
			

	}

}
