package lab3;
import java.util.Scanner;
public class Combination 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,m;
		int r=0;
		System.out.println("Enter Three Digit Number");
		n=sc.nextInt();
		for(int j=0;j<2;j++)
		{
			m=n;
			for(int i=0;i<3;i++)
			{
		      rem=n%10;
		      n=n/10;
		      n=(rem*100)+n;
		      System.out.println("possible combinations are: "+n);
		    }
		}
		while(n!=0)
		  {
		   rem=n%10;
		   n/=10;
		   r=(r*10)+rem;
		  }
		System.out.println("possible combinations are: "+r);
		}
}