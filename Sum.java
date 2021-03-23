package lab3;
import java.util.Scanner;
public class Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		int sum=0;
		for(i=41;i<250;i++)
		{
			if(i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of numbers divisible by 5 in the specified range is = "+sum);
	}
}
