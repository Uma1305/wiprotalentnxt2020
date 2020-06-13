import.java.io.*;
import.java.util.*;
class UserMainCode{
public int totalHillWeight(int input1,int input2,int input3){
int sum=0,i,j;
for(i=0;i<input1;i++){
for(j=0;j<=i;j++)
sum+=input2;
input2=input2+input3;
//weight=input2+input3;
}
return sum;
}
}