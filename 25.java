import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		str[i]=s.next();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(str[i].length()>str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			
		}
		System.out.print(str[0]);
		for(int i=1;i<n;i++)
		System.out.print(" "+str[i]);
	}
}
