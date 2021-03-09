package lab3;
import java.util.Scanner;
public class Marks 
{
	public static void main(String[] args) 
	{
		int i,j;
		int temp=0,temp1=0;
		Scanner sc = new Scanner(System.in) ;
		int stu[]= new int[10];
	    int index[]=new int[10];
	    for(i=0;i<10;i++) 
	    {
	    	System.out.println("Enter marks of Student:"+(i+1));
	    	stu[i]=sc.nextInt();
	    	index[i]=i;
		}
		  int len=stu.length;
		  for(i=0;i<len;i++)
	      {
	    	  for(j=1;j<(len-i);j++)
	    	  {
	    		  if(stu[j-1]>stu[j])
	    		  {
	    			  temp=stu[j-1];  
		              stu[j-1]=stu[j];  
		              stu[j]=temp;  
		              temp1=index[j-1];  
		              index[j-1]=index[j];  
		              index[j]=temp1;       
		            }  
	    		  }
		     }
	      for(i=0;i<10;i++) 
	      {
		     if (stu[i]>=40 && stu[i]<=50) 
		    	 System.out.println("Grade of Student "+(index[i]+1)+" is :PASS");
		     else if(stu[i]>50 & stu[i]<=75) 
		         System.out.println("Grade of Student "+(index[i]+1)+" is :MERIT");
		     else if(stu[i]>75 & stu[i]<101) 
		          System.out.println("Grade of Student "+(index[i]+1)+" is :DISTINCTION");
		    }
		}
}