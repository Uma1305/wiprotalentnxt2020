import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        String in=s.nextLine();
        if(in.contains("a")||in.contains("e")||in.contains("i")||in.contains("o")||in.contains("u"))
        {
        if(in.contains("a"))
        {
            System.out.print("a");
        }
        if(in.contains("e"))
        {
            System.out.print("e");
        }
        if(in.contains("i"))
        {
            System.out.print("i");
        }
        if(in.contains("o"))
        {
            System.out.print("o");
        }
        if(in.contains("u"))
        {
            System.out.print("u");
        }
        }
        else
        {
            System.out.print("Thank You");
        }
    }
}