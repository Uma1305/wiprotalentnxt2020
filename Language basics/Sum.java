import java.io.*;
import java.util.*;

class Sum
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=Integer.parseInt(args[0]);
System.out.println(a);
b=Integer.parseInt(args[1]);
System.out.println(b);
c=a+b;
System.out.println("The sum of "+a+" and "+b+" is "+c);
}
}
