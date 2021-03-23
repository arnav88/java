import java.util.Scanner;
class Greatest
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=9;b=10;c=5;
if(a>b&&a>c)
{
System.out.println("a is greatest");
}
if(b>a&&b>c)
{
System.out.println("b is greatest");
}
else
{
System.out.println("c is greatest");
}
}
}
