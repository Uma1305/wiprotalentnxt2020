import java.io.*;
import  java.util.*;
class Alldigitscount{
 public  int alldigitsCount(int input1){
	int c=0,r;
	while(input1>0)
	{
	   r=input1%10;
	   c++;
	  input1/=10;
	}
	return c;
		
	}
        }
}