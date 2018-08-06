import java.io.*;
import java.util.*;
class Numbers
{
public static void main(String args[])
{
System.out.println("Enter the values of a,b,c);
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b)
{
System.out.println("a is greater");
}
if(a<b)
{
System.out.println("b is greater");
}
if(b>c)
{
System.out.println("b is greater");
}
if(b<c)
{
System.out.println("c is greater");
}
if(c<a)
{
System.out.println("a is greater");
}
if(c>a)
{
System.out.println("c is greater");
}
else
{
System.out.print("The given input is not a  number");
}
}
}
