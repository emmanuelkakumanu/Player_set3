import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.trim();
		char ch[]=new char[str.length()];int j=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=' ')
			{
				ch[j++]=c;
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(ch[i]);
		}


	}
}
