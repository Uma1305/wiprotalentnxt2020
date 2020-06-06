import java.io.*;
import  java.util.*;

class CountEvens{
	public int countEvens(int input1,int input2,int input3,int input4,int input5){
int count=0;
    if(input1<0)input1=(-1)*input1;
    if(input2<0)input2=(-1)*input2;
    if(input3<0)input3=(-1)*input3;
    if(input4<0)input4=(-1)*input4;
    if(input5<0)input5=(-1)*input5;
    if(input1%2==0)
    count++;
    if(input2%2==0)
    count++;
    if(input3%2==0)
    count++;
    if(input4%2==0)
    count++;
    if(input5%2==0)
    count++;
    
    return count;
    }
    }