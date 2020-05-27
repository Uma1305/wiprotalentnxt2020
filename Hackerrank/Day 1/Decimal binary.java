import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Decimal_Binary{
    public static void main(String[] args)
    {
        int n, m ,count=0,a;
        String x = "";
        Scanner s = new Scanner(System.in);
    
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
             if(a==0)
             {
                 count++;

             }
            x = a +""+ x;
            n = n / 2;
        }
        System.out.println(x);
        System.out.println(count);

    }
}
