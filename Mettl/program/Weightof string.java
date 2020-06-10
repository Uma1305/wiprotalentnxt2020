import java.io.*;
import  java.util.*;
class Weightof string{
	public int weightofstring(String input1,int input2){

	int weight=0;
	for(int i=0;i<input1.length();i++)
	{
		char let=input1.charAt(i);
		if(input2==0)
		{
			if(let=='a'||let=='e'||let=='i'||let=='o'||let=='u'||let=='A'||let=='E'||let=='I'||let=='O'||let=='U')
			{
				continue;
			}
		}
		if(let>=65&& let<=90)
		{
			weight+=let-64;

		}
		else if(let>=97&&let<=122)
		{
			weight+=let-96;
		}
	}
	return weight;
	}
}