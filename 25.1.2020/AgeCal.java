import java.util.Scanner;
public class AgeCal
{
    public static void main(String[] args)
    {
	int by,bm,bd,cy,cm,cd,y,m,d;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter birth year:: ");
	by=in.nextInt();
	System.out.println("Enter birth month :: ");
	bm=in.nextInt();
	System.out.println("Enter birth days :: ");
	bd=in.nextInt();
	System.out.println("Enter Current year:: ");
	cy=in.nextInt();
	System.out.println("Enter Current month:: ");
	cm=in.nextInt();
	System.out.println("Enter Current days:: ");
	cd=in.nextInt();
	
	y=cy-by;
	
	m=(y*12)-(bm-cm);
	
	System.out.println(m);
	
	d=(y*365)-(bd-cd);
	System.out.print(d);
	

	}
	
	
	
	}


