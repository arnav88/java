package lab3;
import java.util.Scanner;
//my first git commit
public class ArraySquareSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[],i,j;
		int sum=0;
		arr=new int[10];
		System.out.println("Enter 10 array elements");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			j=arr[i];
			sum=sum+(j*j);
		}
		System.out.println(sum);
	}
}
