import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String txt=s.nextLine();
		txt=txt.trim();
		char ch[]=new char[txt.length()];int j=0;
		for(int i=0;i<txt.length();i++)
		{
			char c=txt.charAt(i);
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
